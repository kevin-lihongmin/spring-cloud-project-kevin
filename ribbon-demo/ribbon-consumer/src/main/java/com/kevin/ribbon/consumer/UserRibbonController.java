package com.kevin.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServicePath}")
    private String userServicePath;

    @GetMapping("/getRemoteUser/{userId}")
    public String getRemoteUser(@PathVariable Long userId) {
        return restTemplate.getForObject(userServicePath + userId, String.class);
    }
}
