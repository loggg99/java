package member_2;

import java.sql.*;
import java.util.Scanner;

public class member_2 {


    public Connection connection() {
        String url = "jdbc:mysql://localhost:3306/user";
        String user = "root";
        String password = "1234";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void addMember(String userId, String password, String name, int age, String phone) {
        String query = "INSERT INTO users (userId, password, name, age, phone) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query)
        ) {
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, name);
            preparedStatement.setInt(4, age);
            preparedStatement.setString(5, phone);

            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Insert Successful");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void login(String userId, String password) {
        String query = "SELECT name, age, phone FROM users WHERE userId = ? AND password = ?";
        try (
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query)
        ) {
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                System.out.println("Login Successful ");

            } else {
                System.out.println("Login Failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed", e);
        }
    }


    public void exitProgram() {
        System.out.println("Exiting program");
        System.exit(0);
    }


    public static void main(String[] args) {
        member_2 jdbc = new member_2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Sign Up 2. Log In 3. Exit");
            System.out.print("Choose what you want: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your ID: ");
                    String userId = scanner.nextLine();
                    System.out.print("Enter your Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter your Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter your Phone Number: ");
                    String phone = scanner.nextLine();
                    jdbc.addMember(userId, password, name, age, phone);
                    break;
                case 2:
                    System.out.print("Enter your ID: ");
                    String loginId = scanner.nextLine();
                    System.out.print("Enter your Password: ");
                    String loginPassword = scanner.nextLine();
                    jdbc.login(loginId, loginPassword);
                    break;
                case 3:
                    jdbc.exitProgram();
                    break;
                default:
                    System.out.println("It's wrong! Try again.");
            }
        }
    }
}
