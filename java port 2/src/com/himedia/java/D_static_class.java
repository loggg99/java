package com.himedia.java;

class OuterClass {

    int instanceWar = 10;
    static int staticVar = 20;

    //자바에서는 클래스 안에 다른 클래스를 정의할 수 있다.
    // 이때 중첩된 클래스가 static으로 선언되면, 해당 클래스는 정적 중첩 클래스가된다.
    static class StaticNestedClass {
        //정적 중첩 클래스에서는 바깥클래스의 static 변수에만 접근가능


    }

    class InnerClass {
        void display() {
            System.out.println("Inside variable :" + instanceWar);
            System.out.println("Inside variable :" + staticVar);
        }

    }
}

public class D_static_class {
    // 클래스 소속
    // 정적 충첩 클래스는 바깥 클래스의 인스턴트와 독립적이다.
    // 즉, 이 클래슨 ㄴ바깥 클래스의 인스턴스와 연결되며 바깥 클래스의 인스턴스 없이는 사용할 수 없다.
    // 비정적 중첩 클래스는 바깥 클래스의 인스턴스에 종속된다.
    // 즉 이 클래스는 바깥 클래스의 인스턴스에 속하지않으며 바깥 클래스의 인스턴스가 없어도 사용할수있다.

    // 인스턴스화
    // 정적 중첩 클래스의 인스턴스를 생성할 떄는 바깥 클래스의 인스턴스사 필요하지않다.
    // 바깥 클래스의 이름만 사용하여 직접 인스턴스를 생성할수있다.
    //비중첩 클르래스의 인스턴스를 생성하려면 먼저 바깥 클래스의 인스턴스를 생성해야한다.
    // 중첩 클르스의 인스턴스르 생성할때 바깥 클래스으 인스턴스를 면시적으로 참좋나다.

    // 메모리 관리와 ㅅ어능
    //정적중첩클르스
    //바깥 클래스의 인스턴스와 독립적으로 존재하므로 메모리 사요이 더 효율적일수있다.
    // 특히 중첩 클래스가 바깥 클래스의 인스턴스 데이터에 접근할 필요가 ㅇ벗는경우
    // 정적중첩 클래스를 사용하는게 좋다.

    //비정적중첩클래스
    //바깥 클래스의 인스턴스와 연결되기 때문에 인스턴스당 투가적인 메모리를 소바할수있다.
    //따라서 이 클래스가 바깥 클랫의 인스턴스 데이터에 접그냏야 하는 경우에만 사요하는게 좋다.

    // 결론
    // 적적 중첩 클래스
    //바깥 클르스의 인스턴스와 독립적으로 사용할수있고
    // 비정적 중첩클래스
    //바깥 클래스의 인스턴스와 미려접하게 연되어있으며ㅓ
    public static void main(String[] args) {
        OuterClass.StaticNestedClass instance = new OuterClass.StaticNestedClass();

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerobj = outerClass.new InnerClass();
    }
}
