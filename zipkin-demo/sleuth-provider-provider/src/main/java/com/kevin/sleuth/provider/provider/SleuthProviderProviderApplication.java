package com.kevin.sleuth.provider.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *	配置服务器端，启动
 *
 * @author kevin
 * @date 2019/5/15 10:42
 * @since
 */
@EnableEurekaClient
@SpringBootApplication
public class SleuthProviderProviderApplication {

	public static void main(String[] args) {

		SpringApplication.run(SleuthProviderProviderApplication.class, args);
	}

}
