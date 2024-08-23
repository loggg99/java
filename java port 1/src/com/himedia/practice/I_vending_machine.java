package com.himedia.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class I_vending_machine {

    static final int coke = 1, cider= 2, fanta=3, water=4;

    public static void printMenu(int totalMoney) {
        System.out.println("===자판기===");
        System.out.println("[1]콜라-500원 [2]사이다-700원 [3]환타-300원 [4]물-200원");
        System.out.println("[5]돈넣기 [6]반환");
        System.out.println("현재 금액 : " + totalMoney + "원");
        System.out.println("===================================================");
    }
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 메뉴를 선택하시오 -> ");

        return sc.nextInt();
    }

    public static int getMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈을 넣으시오");
        return sc.nextInt();
    }
    public static int calcMoney (int totalMoney, int price){
        return totalMoney - price;
    }
    public static void printException() {
        System.out.println("잔액부족");
    }

    public static void main(String[] args) {
        int totalMoney = 0;

        while (true) {
            printMenu(totalMoney);
            int myChoice = getChoice();
            int result = -1;
            switch (myChoice) {
                case 1:
                    result = calcMoney(totalMoney, coke);
                    if ( result < 0) {
                        printException();
                    }else {
                        totalMoney = result;
                        System.out.println("콜라가 나왓다.");
                }
                    break;
                case 2:
                    result = calcMoney(totalMoney, coke);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    // getMoney
                    totalMoney += getMoney();
                    break;
                case 6:
                    System.out.printf("잔돈 : %d원이 반환되었습니다.", totalMoney);
                    return;
                default:
                    System.out.println("잘 못 누르셨습니다.");
            }
        }





    }

}
