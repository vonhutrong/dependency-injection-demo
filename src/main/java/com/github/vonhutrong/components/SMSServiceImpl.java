package com.github.vonhutrong.components;

public class SMSServiceImpl implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.printf("SMS sent to %s with Message=%s%n", rec, msg);
    }
}
