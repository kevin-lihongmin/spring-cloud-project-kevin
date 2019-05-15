package com.kevin.provider;

import com.kevin.api.UserInterface;
import com.kevin.api.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("getUser/{id}")
    public String getUser(@RequestBody @PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("userName" + id);
        return user.toString() + " port =" + port;
    }



}