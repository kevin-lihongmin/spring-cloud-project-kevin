package com.kevin.hystrixclient;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HystrixCodeDemoController {

    private static Random random = new Random();

    @GetMapping("hello2")
    public String getHello2() {

        return new HelloCommand().execute();
    }

    private class HelloCommand extends HystrixCommand<String> {

        protected HelloCommand() {
            super(HystrixCommandGroupKey.Factory.asKey("helloWorld!"), 100);
        }

        @Override
        protected String run() throws Exception {
            int value = random.nextInt(200);
            System.out.println("get hello 2 value = " + value);
            Thread.sleep(value);
            return "hello world-2!";
        }

        @Override
        protected String getFallback() {
            return "error --- 2";
        }
    }

}
