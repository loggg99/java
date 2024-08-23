package com.himedia.practice;

import java.util.Scanner;

public class D_scanner_print {
    public static void main(String[] args) {

        String name = "lo";
        System.out.printf("이름 : %s \n나이 : %d \n", name, 100);

        int age = 100;
        System.out.printf("나이 : %d\n", age);
        System.out.println("나이 : " +age);

        System.out.printf("[자기소개]\n안녕하세요!\n반갑다.");

        System.out.println("당신의 이름은?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.printf("제 이름은 %s 입니다.\n", userName);
        System.out.print("그럼 나이는?");
        int userAge = sc.nextInt();
        System.out.printf("제 나이는 %d 입니다.", userAge);



    }
}
