import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class A_jdbc {

    public Connection connection()  {
        String url = "jdbc:mysql://localhost:3306/java_basic";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("conn Successful");
            return connection;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    // sql injection?
    public void insertData(String name, int age, String phone) {
        String query = "INSERT INTO users (name, age, phone) VALUES (?, ?, ?)";
        try(
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, phone);

            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Insert Successful");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateData(int id, String name, int age, String phone) {
        String query = "UPDATE users SET name = ?, age = ?, phone = ? WHERE id = ?";

        try (
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ){
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, phone);
            preparedStatement.setInt(4, id);

            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Update Successful");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deleteData(int id) {

        String query = "DELETE FROM users WHERE id = ?";

        try(
            Connection conn = connection();
            PreparedStatement preparedStatement = conn.prepareStatement(query);
                ){
            preparedStatement.setInt(1, id);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Delete Successful");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void selcetAll() {
        String query = "SELECT id, name, age, phone FROM users";

        try(
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String phone = resultSet.getString("phone");

                System.out.println(id+" : "+name+" : "+age+" : "+phone);
                System.out.println("========================");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectOne(int id) {
        String query = "SELECT id, name, age, phone FROM users WHERE id = ?";

        try(
                Connection conn = connection();
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ) {
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String phone = resultSet.getString("phone");

                System.out.println(id + " : " + name + " : " + age + " : " + phone);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        A_jdbc jdbc = new A_jdbc();
       // jdbc.insertData("Alice1",111,"010-121-2121");
        //jdbc.selectOne(8);
        //jdbc.updateData(8,"sally",13,"010-9999-9999");
        //jdbc.selectOne(8);
        //jdbc.deleteData(8);
        jdbc.selcetAll();


    }
}
