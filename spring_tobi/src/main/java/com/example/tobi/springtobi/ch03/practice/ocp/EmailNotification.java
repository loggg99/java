package com.example.tobi.springtobi.ch03.practice.ocp;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("이메일로 알림: " + message);
    }
}

class SMSNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("SMS로 알림:" + message);
    }
}
