package com.himedia.java;

public class start {


    public static void main(String[] args) {

        vending vendingMachine = new machine();

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
