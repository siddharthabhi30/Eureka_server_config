package com.example.Post3producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class Post3ProducerApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(Post3ProducerApplication.class, args);

	}

}
