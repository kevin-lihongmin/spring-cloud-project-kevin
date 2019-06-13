package com.kevin.consul.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConsulConfigController {

    @Value("${kevin}")
    private String kevinConfig;

    @Autowired
    private RedisConfig redisConfig;

    @GetMapping("kevinConfig")
    public String getConfigValue() {

        return "consul 配置中kevin的值为：" + kevinConfig;
    }

    @GetMapping("redisConfig")
    public String getRedisConfig() {

        return "consul 配置中redis的值为：" + redisConfig.toString();
    }
}
