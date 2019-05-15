package com.kevin.userconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.concurrent.ExecutionException;

@EnableEurekaClient
@SpringBootApplication
// @RibbonClient("user-provider") //启动ribbon ,并对USER-PROVIDER进行负载均衡
public class UserConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserConsumerApplication.class, args);
	}

	/*@Autowired
	private LoadBalancerClient loadBalancerClient;

	@RequestMapping("/consumer")
	public String consumer() {
		// 这里是根据配置文件的那个providers属性取的
		ServiceInstance serviceInstance = loadBalancerClient.choose("providers");
		// 负载均衡算法默认是轮询，轮询取得服务
		URI uri = URI.create(String.format("http://%s:%s/user", serviceInstance.getHost(), serviceInstance.getPort()));
		return uri.toString();
	}*/

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {

		return new RestTemplate(new HttpComponentsClientHttpRequestFactory());
	}

}
