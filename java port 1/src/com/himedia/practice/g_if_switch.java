package com.himedia.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class g_if_switch {
    public static void exam1() {
        int score = 90;
        if (score >= 90) {
            System.out.println("A학점");

        }
    }
    public static void exam2() {
        int score = 90;
        if (score >= 60) {
            System.out.println("합격입니다.");

        }else{
            System.out.println("불합격");
        }
    }

    public static void exam3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해라");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    public static void exam4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수는?");
        int score = sc.nextInt();

        if (score >= 90) {
            if (score >= 95) {
                System.out.println("A++");
            }else {
                System.out.println("B++");
            }
        }
    }

    public static void main(String[] args) {
        exam3();
    }
}
