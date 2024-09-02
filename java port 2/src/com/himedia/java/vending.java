package com.himedia.java;

public interface vending {


    void printMenu();
    int getChoice();
    int getMoney();
    int calcMoney(int price);
    void printException();
    void setTotalMoney(int totalMoney);
    int getTotalMoney();




}