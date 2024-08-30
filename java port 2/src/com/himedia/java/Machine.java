package com.himedia.java;

import java.util.Scanner;

public class Machine implements vending {

    private static final int COKE = 500, CIDER = 700, FANTA=300, WATER=200;
    private int totalMoney = 0;

    private int getTotalMoney() {
        return totalMoney;
    }

    public void getTotalMoney(int totalMoney) {
        if(totalMoney > 0) {
            this.totalMoney = totalMoney;
        }else {
            System.out.println("돈이 없다.");
        }
    }

    @Override
    public void printMenu() {
        System.out.println("자판기");
        System.out.println("[1]코라 500 [2]사이다 700 [3]판타 300 [4]물 200");
        System.out.println("[5]e돈엏아 [6]반환");
        System.out.println("현재금액 : " +totalMoney+ "이다" );
        System.out.println("==========================");
    }

    @Override
    public int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 메뉴를 선택 ->");
        return sc.nextInt();

        }
    }

    @Override
    public int getMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("돈내놔");
        return sc.nextInt();
    }

    @Override
    public int calcMoney(, int price) {

        return totalMoney-price;
    }

    @Override
    public void printException() {
        System.out.println("잔액부족");

    }
}
