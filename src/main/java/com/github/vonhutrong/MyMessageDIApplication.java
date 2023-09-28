package com.github.vonhutrong;

import com.github.vonhutrong.comsumer.MyDIApplication;
import com.github.vonhutrong.injectors.EmailServiceInjector;
import com.github.vonhutrong.injectors.SMSServiceInjector;

public class MyMessageDIApplication {

    public static void main(String[] args) {
        String msg = "Hi Trong";
        String email = "vonhutrong@gmail.com";
        String phone = "0123456789";

        MyDIApplication myDIApplication = new MyDIApplication();
        new SMSServiceInjector().inject(myDIApplication);
        myDIApplication.processMessages(msg, phone);

        new EmailServiceInjector().inject(myDIApplication);
        myDIApplication.processMessages(msg, email);
    }
}
