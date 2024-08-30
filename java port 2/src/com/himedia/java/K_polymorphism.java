package com.himedia.java;

// 다형성
// 동일한 인터페이스나 부모 클래스를 공유하는 여러 객체들이 각자 다른 방식으로 동작하도록 할 수 잇는 기능
// 다형성은 하나의 인터페으스로 여러 형태의 객체를 처리할 수 있다 는 의미를 가지고 있다.
// 이를 통해 코드의 유연성과 확장성을 크게 향상시킬수있다.

public class K_polymorphism {
    public static void main(String[] args) {
        K_animal animal = new K_animal();
        K_animal myDog = new K_dog(); // Dog타입에 객체가 animal타입으로 업케스팅
        K_animal myCat = new K_cat();

        animal.sound();
        myDog.sound();
        myCat.sound();
        // 다운케스팅을 통해 다시 Dog타입으로 변환
        K_dog myDog2 = (K_dog)animal;
        myDog2.fetch();
        //숙제 : 오류원인
    }
}
