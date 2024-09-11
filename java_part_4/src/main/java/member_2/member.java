package member_2;

import java.sql.Connection;
import java.util.Scanner;

public class member {
    public Connection connection() {
        String url = "jdbc:mysql://localhost:3306/users";
        String user = "root";
        String password = "1234";

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return null;
    }

   public static int addmember(){
       Scanner sc = new Scanner(System.in);
       System.out.println("submit your ID");
       int id = sc.nextInt();
       System.out.println("submit your password");
       String password = sc.next();
       System.out.println("submit your name");
       String name = sc.next();
       System.out.println("submit your age");
       int age = sc.nextInt();
       System.out.println("submit ypur phoneNumber");
       String phoneNumber = sc.next();


       return id;
   }


    public static void main(String[] args) {





    }

}
