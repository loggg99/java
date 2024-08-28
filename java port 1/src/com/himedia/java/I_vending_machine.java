package com.himedia.java;

import java.util.Scanner;

public class I_vending_machine {
    //final : 변경 안됨
    static final int COKE = 500, CIDER = 700, FANTA=300, WATER=200;

    public static void printMenu(int totalMoney) {
        System.out.println("자판기");
        System.out.println("[1]코라 500 [2]사이다 700 [3]판타 300 [4]물 200");
        System.out.println("[5]e돈엏아 [6]반환");
        System.out.println("현재금액 : " +totalMoney+ "이다" );
        System.out.println("==========================");
    }
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 메뉴를 선택 ->");
        return sc.nextInt();
    }

    public static int getMoney() {
        //돈을 넣으시오
        Scanner sc = new Scanner(System.in);
        System.out.print("돈내놔");
        return sc.nextInt();

    }

    public static int calcMoney(int totalMoney,int price) {
        return totalMoney-price;

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
                    result = calcMoney(totalMoney,COKE);
                    if (result <0) {
                        printException();

                    }else{
                        totalMoney = result;

                    }
                    System.out.println("콜라가 나왔다.");
                    break;
                case 2:
                    result = calcMoney(totalMoney,CIDER);
                    if (result <0) {
                        printException();
                    }else{
                        totalMoney = result;
                    }
                    System.out.println("사이다가 나왔다.");
                    break;
                case 3:
                    result =calcMoney(totalMoney,FANTA);
                    if (result <0) {
                        printException();
                    }else{
                        totalMoney = result;
                }
                    System.out.println("판타가 나왔다.");
                    break;
                case 4:
                    result = calcMoney(totalMoney,WATER);
                    if (result <0) {
                        printException();
                    }else{
                        totalMoney = result;
                    }
                    System.out.println("물이 나왔다.");
                    break;
                case 5:
                    //getMoney
                    totalMoney += getMoney();

                    break;
                case 6:
                    System.out.printf("잔돈 : %d원이 반환",totalMoney);
                    return;

                default:
                    System.out.println("wkathej");
            }

        }


    }
}
