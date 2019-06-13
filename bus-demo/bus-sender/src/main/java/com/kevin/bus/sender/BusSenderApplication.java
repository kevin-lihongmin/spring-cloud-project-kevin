package com.kevin.bus.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BusSenderApplication {

	private static final Logger log = LoggerFactory.getLogger(Sender.class);

	public static void main(String[] args) {
		SpringApplication.run(BusSenderApplication.class, args);
	}

	@Autowired
	private Sender sender;

	@RequestMapping("send")
	public String send() {
		for (int i = 0; i < 1000000; i++) {
			sender.send(i);
		}
		return "success!";
	}
}
