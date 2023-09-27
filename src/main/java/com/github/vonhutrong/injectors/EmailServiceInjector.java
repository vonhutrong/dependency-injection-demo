package com.github.vonhutrong.injectors;

import com.github.vonhutrong.components.EmailServiceImpl;
import com.github.vonhutrong.comsumer.Consumer;
import com.github.vonhutrong.comsumer.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication myDIApplication = new MyDIApplication();
        myDIApplication.setMessageService(new EmailServiceImpl());
        return myDIApplication;
    }
}
