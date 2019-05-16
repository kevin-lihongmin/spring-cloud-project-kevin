package com.kevin.sleuth.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author kevin
 * @date 2019/5/16 10:23
 */
@Service
public class UserProviderService {

    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserProviderService.class);

    /**
     *  获取配置文件中的服务url
     */
    @Value(value = "${config.user.provider.provider}")
    private String configUserProvider;

    @Autowired
    private RestTemplate restTemplate;

    public String getUser() throws InterruptedException {
        LOGGER.info("user Server , get User Info!");
        Thread.sleep(30L);

        return restTemplate.getForObject(configUserProvider, String.class);
    }

}
