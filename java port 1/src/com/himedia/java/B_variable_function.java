package com.himedia.java;

// * 변수 : 값을 저장할 수 있는 메모리상의 공간
// 변수 타입 : 변수에 저장될 값이 어떤 타입인지를 지정하는 겋
// 변수이름 : 변수에 붙인 이름
// 번수 초기화 :
//변수 명명 규칙
//1, 대소문자가 구분도ㅓㅣ어 길이에 제한이 없다.
//2. 예약어를 사용해서는 안된다.Ex) ture false break int for
//3 숫자 사용안됨
//4 ㄷ특수문자 : '_'와 $만 허용

//* 변수의 타입
// 기본형(primative type)과 참조형(reference type)
// 자료형은 크게 기본형과 참조형 두가지
// 기본형 변수는 실제값(data)를 지정하는 반면
// 참조형 변수는 어떤 값이 저장되어 있는 주소(memory address)를 값으로 갖는다.
//- 기본형 : 논리형(boolean), 문자형(char), 정수형(byte, short, int, long, 실수형(float, double)
//- 참조형 : 객체의 주소를 지정한다. 기본형을 제외한 나머지 타입

// * 기본형
// 논리형 : boolean
// true와 false중하나를 값으로 가지며, 조건식과 노리적 계산에 사용된다.
// 크기 : 1byte
// 범위 :-
//* 문자형
//문자를 저장하는데 사용되며 하나의 문자만 저장할수 있다.
// 크기 : 2byte
// 범위 : /u0000 ~ /ufff
// * 정수형 : byte, short, int, long
//정수를 저장하는데 사용, byte는 이진데이터를 다룰때, short는 c언어와의 호환을 위해 주가되었다.
//크기 : byte1bye~8bit), short(2byte), int(4byte), long(8byte)
// 실수형 : float, double
// 크기 : float(4byte), double(8byte)

//*상수(constant) : 분수와 마찬가지로 '값을 저장항 수 있는 공간' 이지만,
//* return
//1. 값을 변환
//2. 함수 종료

public class B_variable_function {
    //함수 선언
    public static void exam1 () {

        String myStr = "안녕";
        System.out.println(myStr);

        int num = 10;
        System.out.println(num);

        byte bNum = 127;
        System.out.println(bNum);

        bNum = (byte) 128;
        System.out.println(bNum);

        float fNum = 3.14f;
        System.out.println(fNum);

        double dNum = 3.14;
        System.out.println(dNum);
        fNum = (float) 3.141234343423;
        System.out.println(fNum);


        final float PI = 3.14f;
    }
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    // minus 함수
    public static int minus(int a, int b) {
        int minus = a - b;
        return minus;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        int result = add(3,5);
        System.out.println(result);

        int a = 10;
        int b = 3;
        result = minus(a,b);
        System.out.println(result);
        result = multiply(a,b);
        System.out.println(result);
        double dresult = divide(a,b);
        System.out.println(dresult);

    }
}
//함수  :  프로그램밍에서 특정 작업을 수행하기 위해 잣성된 크드의 묶음




