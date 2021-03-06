package com.kevin.ribbon.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableEurekaClient
@SpringBootApplication
public class UserRibbonProviderApplication {

	@Value("${server.port}")
	private String port;

	@GetMapping("user/{id}")
	public String getUserById(@PathVariable String id) {
		User user = new User();
		user.setId(Long.parseLong(id));
		user.setName("userName" + id);
		System.out.println("send to server !");
		return user.toString() + "( server.port = " + port + ")";
	}

	public static void main(String[] args) {

		SpringApplication.run(UserRibbonProviderApplication.class, args);
	}
}
