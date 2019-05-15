package com.kevin.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 *  熔断器的Web控制面板， 访问路径： http://ip+port/hystrix/
 *
 *  在进入监控页面后访问设置需要监控的服务器地址： 如：http://localhost:8768/hystrix.stream
 *  设置delay值
 *  点击监控即可！
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}
