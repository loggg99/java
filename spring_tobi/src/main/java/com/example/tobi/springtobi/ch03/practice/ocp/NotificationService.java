package com.example.tobi.springtobi.ch03.practice.ocp;

public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message){
        notification.send(message);
    }
}
