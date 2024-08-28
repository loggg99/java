package com.himedia.practice;

import java.util.Scanner;

public class K_membar_managiment2 {
    public static int totalcount;

    




    public static int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]회원추가 [2]회원조회(이름조회) [3]회원조회(이메일 조회)");
        System.out.println("[4]회원 전체 조회 [5]회원정보 수정 [6]회원삭제");



    }


    public static void addMembar (String[][] membar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력 하시오");
        String name = sc.nextLine();
        System.out.println("이메일을 입력 하시오");
        String email = sc.nextLine();
        System.out.println("연락처를 입역 하시오");
        String phone = sc.nextLine();


        membar[totalcount][0] = name;
        membar[totalcount][1] = email;
        membar[totalcount][2] = phone;
        totalcount++;
        

    }
    public static void updateMembar (String[][] membar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정 이메일을 입력하시오");
        String a = sc.nextLine();

        for (int i = 0; i < totalcount; i++) {

        }



    }



    public static void main(String[] args) {
        while (true) {



            switch (menu) {
                case 1:
                    addMembar(membar);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
            }

        }
    }
}