package com.messaging.publisher.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class QueueConfig {

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("bugQueue");
    }


}
