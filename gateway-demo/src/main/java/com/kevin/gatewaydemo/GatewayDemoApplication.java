package com.kevin.gatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 *	Spring Cloud Gateway 服务网关
 *
 * @author kevin
 * @date 2019/6/4 10:33
 * @since 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class GatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayDemoApplication.class, args);
	}

	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r ->
					r.path("/kevin/**")
					.filters(
							f -> f.stripPrefix(1)
					)
					.uri("http://127.0.0.1:8090/helloWorld")
				)
				.build();
	}
}
