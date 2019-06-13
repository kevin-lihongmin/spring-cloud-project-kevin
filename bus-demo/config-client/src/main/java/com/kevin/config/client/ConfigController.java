package com.kevin.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * {@link RefreshScope } 开启更新功能
 *
 * @author kevin
 * @date 2019/5/24 11:09
 * @since
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value("${kevinName}")
    private String kevinName;

    @GetMapping("kevinName")
    public String getProperties() {

        return kevinName;
    }

}
