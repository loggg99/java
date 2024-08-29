package com.himedia.java;

public class A_tv {
    String color;
    boolean power;
    int volume;
    int channel;

    //생성자 : 객체가 생성될때, 최초 한번만 실행되는 메서드 -> 값을 초기화
    public A_tv() {
        System.out.println("초기화 진행시작");
        this.color = "black";
        this.power = false;
        this.volume = 10;
        this.channel = 3;
        System.out.println("초기화 종료");
    }



    public void power() {
        power = !power;
        System.out.println("tv전원을  " +(power ? "켰다" : "껐다."));

    }

    public void volumeup() {
        volume++;
        System.out.println("볼륨을 올렸다." +volume);
    }
    public void channelup() {
        channel++;
        System.out.println("체널업" +channel);

    }
    public void channeldown() {
        channel--;
        System.out.println("체널다운" +channel);
    }

    public void getColor() {
        System.out.println("tv color: " + color);
    }
}
