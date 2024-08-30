package com.himedia.java;

public class F_person5 {

    String name;
    int age;

    public F_person5() {
        //반드시 첫 줄에 생성자 호출이 와야한다.
        this("john", 14);
        //this 로 호출해야된다.
        //F_person5 안된다
        System.out.println(name + " : " + age);

    }

    public F_person5(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
