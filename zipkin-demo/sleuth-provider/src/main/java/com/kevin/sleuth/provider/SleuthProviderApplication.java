package com.kevin.sleuth.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 *	配置服务器端，启动
 *
 * @author kevin
 * @date 2019/5/15 10:42
 * @since
 */
@EnableEurekaClient
@SpringBootApplication
public class SleuthProviderApplication {

	public static void main(String[] args) {

		SpringApplication.run(SleuthProviderApplication.class, args);
	}

	/**
	 *  将{@link RestTemplate} 注解成一个{@code Bean}
	 *
	 * @return {@link RestTemplate }
	 */
	@Bean
	@LoadBalanced
	public RestTemplate initRestTemplate() {

		return new RestTemplate(new HttpComponentsClientHttpRequestFactory());
	}
}
