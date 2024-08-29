package com.himedia.java;

//메서드
//메서드는 특정 작업을 수행하는 일련의 문장들을 하나로 뭈은것

//메서드를 사용하는 이유
//1 높은 재사용성
//2 중복코드제거
//3 프로그램구조화

// 메서드 선언과 구현
//메서드는 크게  두부분 '선언부(header)'와 구현부(body)로 이루어져있다.
//메서드 선언부 : 메서드 선언부는 '메서드의 이름' '매개변수 선언' 그리고 반환타입
//메서드가 작업으 ㄹ수행하기위해 어떤 값들을 필요로 하고 작업의 경과로 어떤타입을
//반환하는지에 대한 정보 제공
/*
    public in add (int a, int b) -> 선언부
    {
        // -> 구연부
        return a+b;
    }
 */
  // 메서드 호출: 메서드를 정의 했어도 호출되지 않으면 아무일도 일어나지 않는다.
  /*
    메서드이름(값1, 값2, 값3,....); 메서드를 호출하는 방법
   */
public class B_method {
    public static void main(String[] args) {
        B_calculator calc = new B_calculator();
         int result = calc.add(1,2);
         System.out.println(result);
         result = calc.minus(3, 2);
         System.out.println(result);
         result =calc.multi(5, 2);
         System.out.println(result);
         result = calc.divide(5,2);
         System.out.println(result);


    }
}
