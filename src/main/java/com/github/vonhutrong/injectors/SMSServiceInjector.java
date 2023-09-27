package com.github.vonhutrong.injectors;

import com.github.vonhutrong.components.SMSServiceImpl;
import com.github.vonhutrong.comsumer.Consumer;
import com.github.vonhutrong.comsumer.MyDIApplication;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication myDIApplication = new MyDIApplication();
        myDIApplication.setMessageService(new SMSServiceImpl());
        return myDIApplication;
    }
}
