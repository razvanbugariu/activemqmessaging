package com.messaging.publisher.controllers;

import com.messaging.publisher.message.MessagePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public PublisherController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping(value = "/publish/{text}")
    public HttpEntity publish(@PathVariable(value = "text") String text) {
        System.out.println("Publishing: " + text );
        jmsTemplate.convertAndSend("bugQueue", text);
        return HttpEntity.EMPTY;
    }


}
