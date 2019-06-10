package com.kevin.consul.consumer;

import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements HelloService {

    public String hello() {
        return null;
    }
}
