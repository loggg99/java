package com.himedia.practice;

import java.util.Scanner;

public class K_member_management {
    static int totalCnt = 0;
    static int totalMemberCnt = 0;

    public static int printPricePlan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[요금제를 선택하세요.]");
        System.out.println("[1]Lite : 10명 [2]Basic : 20명 [3]Premium : 30명 ");

        return sc.nextInt();
    }

    public static int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[수행할 업무를 선택하세요 - 현재 회원수 " + totalMemberCnt + " / " + totalCnt + "]");
        System.out.println("[1]회원추가 [2]회원조회(메일) [3]회원조회(이름)");
        System.out.println("[4]전체조회 [5]회원정보 수정 [6]회원삭제");
        System.out.println("[7]프로그램 종료");

        return sc.nextInt();
    }

    public static void addMember(Scanner[][] member) {

        if (totalMemberCnt >= totalCnt) {
            System.out.println("회원이 꽉 찼다.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하시오");
        String name = sc.nextLine();
    }




    public static void main(String[] args) {

    }
}
