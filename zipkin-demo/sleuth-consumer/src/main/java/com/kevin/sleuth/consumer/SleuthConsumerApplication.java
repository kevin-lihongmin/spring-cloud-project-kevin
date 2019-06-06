package com.kevin.sleuth.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 *	服务调用链为 ：
 *	   config-client-consumer -> config-client-provider -> config-client-provider-provider
 *
 *	首先所有的服务都注册到 Eureka-Server集中中心， 当所有服务都配置了maven spring-cloud-starter-sleuth
 *  则默认 Spring Cloud Sleuth 已经与日志进行管理，在没有调用时，日志格式为：
 *   2019-05-16 13:14:26.232  INFO [config-client-provider-provider,,,] 10768 --- [trap-executor-0] 。。。
 *
 *  当服务开始从web 使用链接 http://localhost:8905/userInfo 进行调用时，每个服务的日志如下：
 *  config-client-consumer：
 *      2019-05-16 13:05:48.980  INFO [config-client-consumer,39d9e7cd26628cd0,39d9e7cd26628cd0,false] 7228 --- [nio-8905-exec-4] 。。。
 *  config-client-provider：
 *      2019-05-16 13:05:49.015  INFO [config-client-provider,39d9e7cd26628cd0,5c9eadd20f58fd77,false] 9404 --- [nio-8903-exec-8] 。。。
 *  config-client-provider-provider：
 *      2019-05-16 13:05:49.052  INFO [config-client-provider-provider,39d9e7cd26628cd0,45f564eb361448b3,false] 10768 --- [nio-8901-exec-4] 。。。
 *
 * @author kevin
 * @date 2019/5/15 10:42
 * @since
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClients({@RibbonClient(name = "sleuth-provider")})
public class SleuthConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SleuthConsumerApplication.class, args);
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
