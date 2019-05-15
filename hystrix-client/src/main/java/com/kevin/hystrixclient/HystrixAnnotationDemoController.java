package com.kevin.hystrixclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HystrixAnnotationDemoController {

    /**
     *  启动一个随机数
     */
    private static Random random = new Random();

    @HystrixCommand(
            fallbackMethod = "errorFunction",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "100")
            }
    )
    @GetMapping("/hello")
    public String getHelloWorld() throws InterruptedException {
        int value = random.nextInt(200);
        System.out.println("get hello value = " + value);
        Thread.sleep(value);
        return "hello world!";
    }

    public String errorFunction() {
        return "get timeout!";
    }
}
