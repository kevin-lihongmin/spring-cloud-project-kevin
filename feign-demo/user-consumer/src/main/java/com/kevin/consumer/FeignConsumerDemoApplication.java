package com.kevin.consumer;

import com.kevin.api.UserInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(clients = UserInterface.class)
@EnableHystrix
@ComponentScan(basePackages = {"com.kevin"})
public class FeignConsumerDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(FeignConsumerDemoApplication.class, args);
	}

	/*@Bean
	public MyServerForeverRule initMyServerForeverRule() {
		return new MyServerForeverRule();
	}*/

}
