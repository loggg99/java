package com.himedia.practice;

public class H_loop {

    public static void exam1(){
        for(int i = 0; i<10; i++){
            System.out.println("cnt : " +i);
        }
    }
    public static void exam2(){
        System.out.println("국단2단");
        for(int i = 1; i<10; i++){
            System.out.println( "2 *" + i + "=" +2*i);
        }
    }

    public static void exam3(){
        for(int i = 1; i<10; i++){
            System.out.println( "첫번째 for문 : " +i);
            for(int j = 0; j<10; j++){
                System.out.println(j);
            }
        }
    }

    public static void exam4(){
        System.out.println("구구단");
        for(int i = 2; i<10; i++){
            System.out.println("%d단\n, i");
            for(int j = 1; j<10; j++){
                System.out.printf("%d * %d = %d\n", i,j, i*j);
            }
        }
    }

    public static void main(String[] args) {

        exam4();
    }
}
