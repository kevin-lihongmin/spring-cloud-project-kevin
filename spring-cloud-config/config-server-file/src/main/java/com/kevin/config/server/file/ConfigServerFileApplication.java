package com.kevin.config.server.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *	文件类型的配置服务器端
 *
 * @author kevin
 * @date 2019/5/24 9:27
 * @since
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerFileApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigServerFileApplication.class, args);
	}

}
