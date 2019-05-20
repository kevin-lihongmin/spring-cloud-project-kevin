package com.kevin.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zookeeper-user-provider", fallback = FeignFallBack.class)
public interface UserService {

    /**
     *  定义Feign的接口
     *  使用{@link RequestParam} 一定要添加value值，否则不能正确的解析
     *
     * @param id 用户id
     * @return 用户信息
     */
    @GetMapping("user")
    String getUserInfo(@RequestParam(value = "id") Long id);

}
