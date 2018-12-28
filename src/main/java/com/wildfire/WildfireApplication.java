package com.wildfire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WildfireApplication {

	public static void main(String[] args) {
		SpringApplication.run(WildfireApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}

