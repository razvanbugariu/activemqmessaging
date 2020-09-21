package com.messaging.publisher.message;

import java.io.Serializable;

public class MessagePojo implements Serializable {
    private String text;

    public MessagePojo() {
    }

    public MessagePojo(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "MessagePojo{" +
                "text= " + text +
                '}';
    }
}

