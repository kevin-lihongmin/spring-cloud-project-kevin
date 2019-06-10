package com.kevin.consul.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "consul-provider", fallback = FeignFallBack.class)
public interface HelloService {

    /**
     *   hello服务
     *
     * @return hello
     */
    @RequestMapping("/hello")
    String hello();

}
