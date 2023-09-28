package com.github.vonhutrong.injectors;

import com.github.vonhutrong.components.SMSServiceImpl;
import com.github.vonhutrong.comsumer.Consumer;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public void inject(Consumer consumer) {
        consumer.setMessageService(new SMSServiceImpl());
    }
}
