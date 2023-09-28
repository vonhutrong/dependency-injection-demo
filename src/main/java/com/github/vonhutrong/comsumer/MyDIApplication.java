package com.github.vonhutrong.comsumer;

import com.github.vonhutrong.components.MessageService;

public class MyDIApplication implements Consumer {

    private MessageService messageService;

    public MyDIApplication() {}

    @Override
    public void processMessages(String msg, String rec) {
        messageService.sendMessage(msg, rec);
    }

    @Override
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
