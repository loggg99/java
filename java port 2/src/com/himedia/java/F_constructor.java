package com.himedia.java;

//생성자 (constructor)
//객체가 생성될떄 호출되는 특수한 메서드
// 생성자는 객체의 초기 상태를 성정하는데 사용되며
// 클래스 이름과 동일한 이름을 가져야한다.
// 생성자는 반환타입이 없으며 객체가 생성될떄 자동으로 호출된다.

//생성자의 종류
//1 기본생성자(Default Constructor)
// - 매개변수가 없는 생성자
// 클래스에 생성자가 정의된지 ㅇ낳으면 컴파일러는 자동으로 기본 생성자를 추가한다.

//2 매개변수가 있는 생성자(Parameterized Constructor)
//객체를 생성할 떄 인수를 전달 받아 필드를 필드를 초기화하는 생성자이다.
// 여러개의 생성자를 오버로딩하여 다양한 초기화 방법을 제공할수잇다.

//3 복사생성자
// 동일한 클래스의 다른 객체를 복사하여 새로운 객체를 생성하는 생성자이다.
// 자바에서는 기본적으로 제공되지 않지만 필요에 따라 개발자가 직접구현할수있따.,

// * 생성자의 역할과 이점
// 1. 객체 초기화 : 생성자는 객체가 생성될 때 필요한 초기값을 설정하는데 사용된다.
// 2. 코드의 가독성 : 다양한 형태의 생성자를 제공함으로써, 객체를 직과적이고 간결하게 생성할 수 있다.
// 3. 오버로딩을 통한 유연성 : 생성자 오버로딩을 통해, 다양한 상황에 맞춰 객체를 생성할 수 있다.
// 4. 캡슐화 : 생성자를 통해 필수적인 초기화가 강제되므로, 객체가 항상 유효한 상태로 생성되도록 할 수 있다

public class F_constructor {
    public static void main(String[] args) {
        F_person1 p1 = new F_person1();
        p1.display();

//        new F_person2(); //만약 매개변수가 있는 생성자가 하나라도 선언되어 있으면
        // 기본 생성자는 자동으로 생성되지 않는다.
        F_person2 p2 = new F_person2("John", 13);
        p2.display();

        F_person3 p3 = new F_person3();
        p3.display();

        p3 = new F_person3("John3");
        p3.display();

        p3 = new F_person3("John3", 13);
        p3.display();

        F_person4 p4 = new F_person4("David", 40);
        F_person4 pCopy = new F_person4(p4);

        p4.display();
        pCopy.display();
        // 생성자에서 다른 생성자 호출하기 - this()
        // 생성자의 이름으로 클래스 이름 대신 this를  사용
        // 한 생성자에서 다른 생성자를 호출할 떄는 반드시 첫줄에서만 호출

        F_person5 p5 = new F_person5();

    }
}