package com.kevin.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 *  路由Api gateway
 *  默认路由规则为： http://ZUUL-HOST:ZUUL-PORT/serviceId/**
 *
 * @author kevin
 * @date 2019/5/30 9:15
 * @since 1.0
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

	@Bean
	public PreRequestLog2Filter preRequestLog2Filter(){
		return new PreRequestLog2Filter();
	}

	@Bean
	public RouteRequestFilter routeRequestFilter(){
		return new RouteRequestFilter();
	}

	@Bean
	public PostInfoFilter postInfoFilter(){
		return new PostInfoFilter();
	}

	@Bean
	public ErrorFilter errorFilter(){

		return new ErrorFilter();
	}
}
