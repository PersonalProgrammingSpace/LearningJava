package com.bsoft.MyTube;

public class EmailService implements NotificationService {
    @java.lang.Override
    public void notify(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
