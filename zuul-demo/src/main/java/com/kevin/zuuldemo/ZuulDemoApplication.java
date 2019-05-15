package com.kevin.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 *  路由Api gateway
 *  默认路由规则为： http://ZUULHOST:ZUULPORT/serviceId/**
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(ZuulDemoApplication.class, args);
	}

	@Bean
	public PreRequestLogFilter preRequestLogFilter(){

		return new PreRequestLogFilter();
	}
}
