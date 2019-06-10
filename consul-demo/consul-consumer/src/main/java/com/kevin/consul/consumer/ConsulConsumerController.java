package com.kevin.consul.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsulConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHelloInfo() {
        return helloService.hello();
    }

}
