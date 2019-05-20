package com.kevin.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private int port;

    @GetMapping("user")
    public String getUserInfo(@RequestParam Long id) {
        User user = new User();
        user.setId(id);
        user.setName("userName-" + id);

        return user.toString() + "port:" + port;
    }

}
