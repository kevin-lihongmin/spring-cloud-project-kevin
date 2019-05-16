package com.kevin.sleuth.provider.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  用户 Controller
 *
 * @author kevin
 * @date 2019/5/16 9:50
 */
@RestController
public class UserProviderProviderController {

    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserProviderProviderController.class);

    @Autowired
    private UserProviderProviderService userProviderProviderService;

    @GetMapping("userInfo")
    public String getUserInfo() throws InterruptedException {

        LOGGER.info("get userInfo");
        return userProviderProviderService.getUser();
    }
}
