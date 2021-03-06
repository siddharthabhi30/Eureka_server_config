package com.example.postconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PostConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostConfigServerApplication.class, args);
	}

}
