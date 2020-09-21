package com.messaging.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(destination = "bugQueue")
    public void receive(String messagePojo) {
        System.out.println("Received " + messagePojo);
    }
}
