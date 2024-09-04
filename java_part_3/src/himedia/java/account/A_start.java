package himedia.java.account;

import java.util.Scanner;
//A_account.java(I)
//A_accountImpl.java
//->History 저장소 collection으로 바꿀것
//->Histories는 계속 저장될수 있다.
//A_start.java
//-> 상수로서 사용 목적이 아니하면 static사용 금지





public class A_start {
    public static void main(String[] args) {
        A_account account = new A_accountImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            account.printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    account.addMoney();
                    break;
                case 2:
                    account.subMoney();
                    break;
                case 3:
                    account.printHistory();
                    break;
                case 4:
                    System.out.println("thank you");
                    return;
            }
        }

    }
}
