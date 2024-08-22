package com.himedia.java;

//* 연산자
//산술연산자 : + - * / %
//단항연산자 : ++ --
//비교연산자 : > < => =< == !=
//논리연산자 : && || ! & | ^ ~
//대입연산자 : =
//기타 : ? :, 복합대입연산자

//* 연산자의 우선순위
//곱셈과 나눗셈은 덧셈 뺄셈보다 우선

public class F_operator {

    public static void exam1 () {
        int a =10;
        int b =4;

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d / %d = %f\n", a, b, a / (double)b);
        System.out.printf("%d %% %d = %d\n", a, b, a % b);
    }
    //단항연산자
    public static void exam2 () {
        //증감 연산자 : 피연산자의 값을 1증가시킨다.
        //i = i+1, i +=1
        int i = 5;
        System.out.println("====증감====");
        System.out.println("전위형 : "+ ++i);//6
        System.out.println("후위형 : " + i++);//6
        System.out.println("결과 : " + i);//7


        //감소연산자 : 피연산자의 값을 1감소시킨다.
        i = 5;
        System.out.println("====증감====");
        System.out.println("전위형 : " - --i);//4
        System.out.println("후위형 : " - i--);//4
        System.out.println("결과 : " - i);//5

        i = i + 1;
        i -= 1;
        i += 4;


    }
    public static void exam3 () {
        System.out.printf("10 == 10.0f \t%b\n", 10==10.0f);
        System.out.printf("'0' == 0 \t%b\n", 0==0);
        System.out.printf("'A' == 'B' \t%b\n", 'A'>'b');
        System.out.printf("'A' == 65 \t%b\n", 'A'==65);
        System.out.printf("'A' > 'B' \t%b\n", 'A'>'B');
        System.out.printf("'A' + 1 != 'B' \t%b\n", 'A' + 1 != 'B');

    }
    //논리 연산자
    //&&: 그리고(AND) - 모두 true일때 true
    //||: 또는 (or) - 둘중하나가 true 일때 true
    //! : 논리 부정 연산 - x가 true일떄 false
    public static void exam5 () {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.printf("A && b : "+ (a && b));
        System.out.printf("A || b : "+ (a || b));
        System.out.printf("A && c : " + (a && c));
        System.out.printf("!a : "+ !a );
    }
    //비트연산자
    //|(or연산자)
    




    public static void main(String[] args) {
        exam3();
    }
}
