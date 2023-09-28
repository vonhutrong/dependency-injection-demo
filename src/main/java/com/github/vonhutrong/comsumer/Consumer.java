package com.github.vonhutrong.comsumer;

import com.github.vonhutrong.components.MessageService;

public interface Consumer {
    void processMessages(String msg, String rec);
    void setMessageService(MessageService messageService);
}
