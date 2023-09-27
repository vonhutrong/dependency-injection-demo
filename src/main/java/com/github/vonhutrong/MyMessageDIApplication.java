package com.github.vonhutrong;

import com.github.vonhutrong.injectors.EmailServiceInjector;

public class MyMessageDIApplication {

    public static void main(String[] args) {
        String msg = "Hi Trong";
        String email = "vonhutrong@gmail.com";

        new EmailServiceInjector()
                .getConsumer()
                .processMessages(msg, email);
    }
}
