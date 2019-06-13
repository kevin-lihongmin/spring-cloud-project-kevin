package com.kevin.bus.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
 
    private static final Logger log = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i) {
        String message = "hello world " + i + " ! ";
        log.info("Sender message : " + message);
        this.amqpTemplate.convertAndSend("hello", message);
    }
}