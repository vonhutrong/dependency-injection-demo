package com.github.vonhutrong;

import com.github.vonhutrong.injectors.SMSServiceInjector;

public class MyMessageDIApplication {

    public static void main(String[] args) {
        String msg = "Hi Trong";
        String phone = "0123456789";

        new SMSServiceInjector()
                .getConsumer()
                .processMessages(msg, phone);
    }
}
