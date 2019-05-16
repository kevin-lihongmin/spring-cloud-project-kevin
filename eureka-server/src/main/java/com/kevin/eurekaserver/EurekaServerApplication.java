package com.kevin.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *	Eureka 服务器端，组成集群可以使用不同的spring profile启动：eureka-1，eureka-2，eureka-3
 *  Eureka集群服务器的组成：
 *  1、在启动类中添加注解 {@link EnableEurekaServer}
 *  2、在配置文件中使用相同的应用名称，如 {@code spring.application.name=eureka-register}
 *  3、配置文件中使用属性{@code eureka.client.serviceUrl.defaultZone}进行相互注解
 *
 *  注意：如果是同一个服务器模拟，端口使用不同的端口,如： {@code server.port=8761}
 *
 * @author kevin
 * @date 2019/5/16 9:19
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
