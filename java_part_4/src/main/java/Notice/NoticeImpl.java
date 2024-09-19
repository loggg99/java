package Notice;

import java.sql.*;
import java.util.Scanner;

public class NoticeImpl implements Notice {
    private Scanner sc = new Scanner(System.in);

    private String loginUser = null;

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

        loginUser = userId;



        String query = "SELECT name, phone FROM User WHERE userId = ? AND password = ?";

        try (
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query)
        ) {
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");




                System.out.println("Welcome  sir " + name);
            }else{
                System.out.println("Login Failed");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void signUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ID");
        String userId = sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter phone number");
        String phone = sc.nextLine();





        String query = "INSERT INTO User (userId, password, name, phone) VALUES (?,?,?,?)";

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
        String query = "SELECT title, text, authorId, time FROM Content";
        try (
                Connection conn =connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                ) {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        String text = resultSet.getString("text");
                        String authorId = resultSet.getString("authorId");
                        String time = resultSet.getString("time");
                        System.out.println("Title: " + title);
                        System.out.println("Text: " + text);
                        System.out.println("AuthorId: " + authorId);
                        System.out.println("Time: " + time);

                    }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void createContent() {
        if(loginUser == null){
            System.out.println("you are not able to text contents unless you are logged in");
            return;
        }
        System.out.println("Title");
        String title = sc.nextLine();
        System.out.println("Content");
        String text = sc.nextLine();

        String query = "INSERT INTO Content (title, text, authorId) VALUES (?,?,?)";
        try (
                Connection conn =connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query)

                ) {
                    preparedStatement.setString(1, title);
                    preparedStatement.setString(2, text);
                    preparedStatement.setString(3, loginUser);

                    int result = preparedStatement.executeUpdate();
                    if (result > 0) {
                        System.out.println("Content Created");
                    }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void modifyContent() {
        if(loginUser == null){
            System.out.println("it's possible to modify content if you are logged in");
            return;
        }
        System.out.println("modify ID : ");
        String contentId = sc.nextLine();
        System.out.println("New Title : ");
        String NewTitle = sc.nextLine();
        System.out.println("New Text : ");
        String NewText = sc.nextLine();

        String query = "UPDATE Content SET title = ?, text = ? WHERE id =? AND authorId = ?";
        try {
            Connection conn = connection();
            PreparedStatement PreparedStatement = conn.prepareStatement(query);
            PreparedStatement.setString(1, NewTitle);
            PreparedStatement.setString(2, NewText);
            PreparedStatement.setString(3, contentId );
            PreparedStatement.setString(4, loginUser);
            int result = PreparedStatement.executeUpdate();

            if (result > 0) {
                System.out.println("Modify Content Successfully");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void deleteContent() {

    }

    @Override
    public void logout() {
        if(loginUser != null){
            System.out.println("You are logged out");
            loginUser = null;
        }else{
            System.out.println("You are not able to log out");
        }

    }

    @Override
    public void deleteId() {
        if (loginUser == null) {
            System.out.println("you are not able to delete ID unless you are logged in");
        } else {
            System.out.println("you really want to delete ID");
        }
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
        System.out.println("[1]login [2]signUp [3]content [4]createContent");
        System.out.println("[5]ModifyContent [6]deleteContent [7]logout");
        System.out.println("[8]deleteId [9]exitProgram");

        return sc.nextInt();
    }
}
