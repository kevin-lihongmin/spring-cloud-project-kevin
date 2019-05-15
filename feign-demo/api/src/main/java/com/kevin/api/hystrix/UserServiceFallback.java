package com.kevin.api.hystrix;

import com.kevin.api.UserInterface;
import com.kevin.api.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserInterface {

    @Value("${server.port}")
    private int port;
    
    @Override
    public String getUser(Long id) {
        User user = new User();
        user.setId(id);
        return user.toString() + " port =" + port;
    }

}