package com.himedia.java;

import java.util.Scanner;

public class G_if_switch {
    public static void exam1() {

    }
    public static void exam2() {
        int score = 90;

        if (score >=60) {
            System.out.println("합");
        }else{
            System.out.println("불합");
        }
    }

    public static void exam4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수입력");
        int score = sc.nextInt();

        if (score >=90) {
            if(score >=95){
                System.out.println("A++");
            }
        }
    }

    // switch
    // switch문의 조건식은 결과값이 반드시 정수 또는 문자열이어야 한다.
    // case문의 값은 전수 상수만 중복no

    public static void exam5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("음료 번호");
        System.out.println("사이다");
        int score = sc.nextInt();
        switch (score) {
            case 1:
                System.out.println("콜라");
                break;
            case 2:
                System.out.println("사이다");
                break;
            case 3:
                System.out.println("사이다");
                break;
            default:
                System.out.println("wkfaht");
        }
    }

    public static void exam6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("sdf");
        int score = sc.nextInt();

        switch (score) {
            case 1:
            case 2:
            case 3:
                System.out.println("sdfsd");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("sdfsd");
            case 7:
            case 8:
            case 9:
                System.out.println("sdfsd");
            case 10:
            case 11:
            case 12:
                System.out.println("sdfsd");
                break;






        }
    }






    public static void main(String[] args) {
        exam6();
    }

}
