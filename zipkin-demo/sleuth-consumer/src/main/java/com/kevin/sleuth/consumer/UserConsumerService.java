package com.kevin.sleuth.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserConsumerService {

    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserConsumerService.class);

    @Autowired
    private RestTemplate restTemplate;

    /**
     *  获取配置文件中的服务url
     */
    @Value(value = "${config.user.provider}")
    private String configUserProvider;

    public String getUser() throws InterruptedException {
        LOGGER.info("user Server , get User Info!");
        Thread.sleep(30L);

        return restTemplate.getForObject(configUserProvider, String.class);
    }

}
