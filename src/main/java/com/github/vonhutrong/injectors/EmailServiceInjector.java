package com.github.vonhutrong.injectors;

import com.github.vonhutrong.components.EmailServiceImpl;
import com.github.vonhutrong.comsumer.Consumer;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public void inject(Consumer consumer) {
        consumer.setMessageService(new EmailServiceImpl());
    }
}
