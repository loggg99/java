package com.himedia.practice;

public class E_casting {
    public static void main(String[] args) {
        double d = 3.14;
        System.out.println(d);
        int score = (int) d;
        System.out.println(score);

        int a = 65;
        System.out.println(a);
        char ch = (char) a;
        System.out.println(ch);

        char ch2 = 'A';
        System.out.println(ch2);
        int a2 = ch2;
        System.out.println(a2);

        int n = 3;
        System.out.println(n);
        float f = n;
        System.out.println(f);


    }
}
