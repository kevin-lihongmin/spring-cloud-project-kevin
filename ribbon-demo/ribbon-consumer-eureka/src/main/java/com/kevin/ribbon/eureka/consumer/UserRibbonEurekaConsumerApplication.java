package com.kevin.ribbon.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 *  使用Eureka 注册中心，根据服务提供者的注册名称，获取服务配置列表，再在客户端进行负载均衡
 *
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClients({@RibbonClient(name = "ribbon-user-provider")})
public class UserRibbonEurekaConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserRibbonEurekaConsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {

		return new RestTemplate(new HttpComponentsClientHttpRequestFactory());
	}

}
