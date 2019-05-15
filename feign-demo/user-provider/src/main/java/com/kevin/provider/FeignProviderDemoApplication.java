package com.kevin.provider;

import com.kevin.api.UserInterface;
import com.kevin.api.hystrix.UserServiceFallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class FeignProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignProviderDemoApplication.class, args);
	}

	@Bean
	public UserServiceFallback initUserServiceFallback() {
		return new UserServiceFallback();
	}
}
