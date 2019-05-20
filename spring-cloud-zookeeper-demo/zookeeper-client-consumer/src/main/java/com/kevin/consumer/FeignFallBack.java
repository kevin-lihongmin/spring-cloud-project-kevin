package com.kevin.consumer;

import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements UserService {

    @Override
    public String getUserInfo(Long id) {

        return null;
    }
}
