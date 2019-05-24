package com.kevin.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Set;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigClientApplication.class, args);
	}

	private ContextRefresher contextRefresher;

	@Autowired
	public ContextRefresher getContextRefresher() {
		return contextRefresher;
	}

	/**
	 *  定时刷新配置
	 */
	@Scheduled(fixedRate = 1000L)
	public void refreshInterval() {
		Set<String> refresh = contextRefresher.refresh();
		if (!refresh.isEmpty()) {
			System.out.println(refresh.toString());
		}
	}
}
