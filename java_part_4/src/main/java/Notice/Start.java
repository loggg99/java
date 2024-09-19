package Notice;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Notice notice = new NoticeImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int choice = notice.printMenu();
            switch (choice) {
                case 1:
                    notice.login();
                    break;
                case 2:
                    notice.signUp();
                    break;
                case 3:
                    notice.content();
                    break;
                case 4:
                    notice.createContent();
                    break;
                case 5:
                    notice.modifyContent();

                    break;
                case 6:
                    break;
                case 7:
                    notice.logout();
                    break;
                case 8:
                    break;
                case 9:
                    notice.exitProgram();
                    System.out.println("thank you ~ see you again");
                    break;
                default:
                    System.out.println("it's wrong choice try again");
                    break;
            }
        }
    }
}
