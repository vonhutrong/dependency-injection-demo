package com.github.vonhutrong.components;

public class EmailServiceImpl implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.printf("Email sent to %s with Message=%s%n", rec, msg);
    }
}
