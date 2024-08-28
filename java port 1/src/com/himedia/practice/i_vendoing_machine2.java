package com.himedia.practice;

import java.util.Scanner;

public class i_vendoing_machine2 {
    static final int COKE = 500, CIDER = 300, FANTA = 700, WATER = 200;
    public static int totalMoney;



    public static void printMenu() {
        System.out.println("vending machine");
        System.out.println("[1]콜라 500 [2]사이다 300 [3]판타 700 [4]물");
        System.out.println("[5]돈 넣기 [6]반환");
        System.out.println("현재 금액 : " +totalMoney+ "원");

    }
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 메뉴를 누르시오");
        return sc.nextInt();
    }

    public static int getMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈 투입");
        return sc.nextInt();
    }

    public static void calculator(int price) {
        totalMoney -= price;
    }



    public static void main(String[] args) {

        while (true) {
            printMenu();
            int result = 0;

            int choice = getChoice();
            switch (choice) {
                case 1:
                    result = totalMoney; // 300
                    calculator(COKE); //500
                    if (totalMoney < 0) {
                        // ->
                        System.out.println("돈이 부족하다.");
                        // -200
                        totalMoney = result;
                    }
                    break;
                case 2:
                    result = totalMoney;
                    calculator(CIDER);
                    if (totalMoney < 0) {
                        System.out.println("돈이 부족하다.");
                        totalMoney = result;
                    }
                    break;
                case 3:
                    result = totalMoney;
                    calculator(FANTA);
                    if (totalMoney < 0) {
                        System.out.println("돈이 부족하다.");
                        totalMoney = result;
                    }
                    break;
                case 4:
                    result = totalMoney;
                    calculator(WATER);
                    if (totalMoney < 0) {
                        System.out.println("돈이 부족하다.");
                        totalMoney = result;
                    }
                    break;
                case 5:
                    totalMoney += getMoney();
                    break;
                case 6:
                    System.out.printf("[반환] %d원 남음",totalMoney);
                    return;
                default:
                    System.out.println("good bye");


            }
        }
    }
}






