package com.kevin.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserConsumerController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser/{id}")
    public String getUserInfo(@PathVariable Long id) {

        return userService.getUserInfo(id);
    }

}
