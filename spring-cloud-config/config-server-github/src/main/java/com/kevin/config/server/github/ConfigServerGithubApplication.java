package com.kevin.config.server.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGithubApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigServerGithubApplication.class, args);
	}

}
