package himedia.java.AccountBook;

import himedia.java.account.A_account;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        AccountBook AB = new AccountImpl();
        Scanner sc = new Scanner(System.in);

        while(true) {
            AB.printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    AB.addAB();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("thank you");
                    return;
            }
        }
    }
}
