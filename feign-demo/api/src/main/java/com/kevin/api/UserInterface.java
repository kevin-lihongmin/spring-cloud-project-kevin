package com.kevin.api;

import com.kevin.api.hystrix.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  定义Feign的接口
 *
 * @author lihongmin
 * @date 2019/5/14
 */
@FeignClient(value = "user-provider", fallback = UserServiceFallback.class)
public interface UserInterface {

    /**
     *  根据用户id获取用户信息
     *  当前为搭建方便直接返回{@link String} ，不适用公共API的方式
     *
     * @param id 用户id
     * @return 用户信息的json格式
     */
    @RequestMapping("getUser/{id}")
    String getUser(@PathVariable("id") Long id);

}