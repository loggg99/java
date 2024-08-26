package com.himedia.java;

// 배열
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는것
// 변수와 달리 배열은 각 저장공간이 연속덕으로 배치되어 있다.
// 순서가 있다.

// 배열생성
// 타입[] 변수이름 =new 타입[길이];
public class J_Array {
    public static void exam1() {
        int[] score = new int[3];//3개의 주소 적용 []: 배열 int[]:참조

        //값을 초기화
        score[0] = 10;
        score[1] = 20;
        score[2] = 30;//0부터 밑에서부터 주소 적용

        System.out.println(score);//주소
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);

    }
    public static void exam2() {
        int[] score = {10, 20, 30};
        System.out.println(score.length);
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
    public void exam3() {
        int[] score = new int[3];

        //초기화
        for (int i = 0; i < score.length; i++) {
            score[i] = 10 * 1;
        }
        //조회
        for(int s :score){
            System.out.println(s);
        }

    }
    public static void exam4() {
        char[] words = {'h', 'e', 'l', 'l', 'o'};
        for (char c : words) {
            System.out.println(c);
        }
    }
    public static void exam5() {
        String[] temp = new String[2];
        temp[0] = "hello";
        temp[1] = "world";

        String[] words = { "Hello", "World" };
        for (String s : words) {
            System.out.println(s);
        }
    }

    public static int exam6(int[] score, int num) {
        score[1] = 90;
        num = 90;
        return num;
    }

    public static void exam6_1() {
        int[] score = {10, 20, 30};
        int num = 20;

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println(num);

        System.out.println("===============");
        num = exam6(score, num); // 호출

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println(num);
    }


    public static void main(String[] args) {
        exam6_1();
    }
}
