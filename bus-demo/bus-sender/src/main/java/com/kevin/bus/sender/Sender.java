package com.kevin.bus.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Sender {
 
    private static final Logger log = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("send")
    public void send() {
        String message = "hello world! ";
        log.info("Sender message : " + message);
        this.amqpTemplate.convertAndSend("hello", message);
    }
}