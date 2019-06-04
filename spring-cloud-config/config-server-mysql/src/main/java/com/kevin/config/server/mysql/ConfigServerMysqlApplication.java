package com.kevin.config.server.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerMysqlApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigServerMysqlApplication.class, args);
	}

}
