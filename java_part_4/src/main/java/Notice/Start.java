package Notice;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Notice notice = new NoticeImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            notice.printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    notice.login();
                    break;
                case 2:
                    notice.signUp();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("thank you ~ see you again");
                    return;
            }
        }
    }
}
