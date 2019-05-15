package com.kevin.hystrixclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class HystrixClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixClientApplication.class, args);
	}

}
