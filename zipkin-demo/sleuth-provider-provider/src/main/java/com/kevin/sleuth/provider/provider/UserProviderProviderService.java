package com.kevin.sleuth.provider.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author kevin
 * @date 2019/5/16 10:23
 */
@Service
public class UserProviderProviderService {

    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserProviderProviderService.class);

    public String getUser() throws InterruptedException {
        LOGGER.info("user Server , get User Info!");
        Thread.sleep(30L);
        return "{'id': 1}";
    }

}
