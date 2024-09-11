package Notice;

import java.sql.*;
import java.util.Scanner;

public class NoticeImpl implements Notice {
    private Scanner sc = new Scanner(System.in);

    public Connection connection(){
        String url = "jdbc:mysql://localhost:3306/Notice";
        String user = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void login() {
        System.out.println("ID");
        String userId = sc.nextLine();
        System.out.println("password");
        String password = sc.nextLine();

        String query = "SELECT name, phone FROM notice WHERE useId = ? AND password = ?";
        try (
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query)
        ) {
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                System.out.println("Welcome");
            }else{
                System.out.println("Login Failed");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void signUp() {
        System.out.println("enter ID");
        String userId = sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter phone number");
        String phone = sc.nextLine();


        String query = "INSERT INTO notice (userId, password, name, phone VALUES (?,?,?,?)";
        try(
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query)

        ) {
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, name);
            preparedStatement.setString(4, phone);

            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Sign Up Successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void content() {
        String query = "SELECT * FROM notice WHERE useId = ?";


    }

    @Override
    public void updateContent() {

    }

    @Override
    public void modifyContent() {

    }

    @Override
    public void deleteContent() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void deleteId() {

    }

    @Override
    public void exitProgram() {
        System.out.println("Exiting Program");
        System.exit(0);

    }

    @Override
    public int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============== Menu ===============");
        System.out.println("[1]login [2]signUp [3]content [4]updateContent");
        System.out.println("[5]updateContent [6]deleteContent [7]logout");
        System.out.println("[8]deleteId [9]exitProgram");

        return sc.nextInt();
    }
}
