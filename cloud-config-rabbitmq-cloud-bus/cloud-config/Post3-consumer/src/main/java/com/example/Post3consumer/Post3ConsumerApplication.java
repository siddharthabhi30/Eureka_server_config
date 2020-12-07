package com.example.Post3consumer;

import com.example.Post3consumer.controller.PostContollerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

@SpringBootApplication
public class Post3ConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException  {

		ApplicationContext ctx= SpringApplication.run(Post3ConsumerApplication.class, args);
		PostContollerClient postContollerClient=ctx.getBean(PostContollerClient.class);
		System.out.println(postContollerClient);
		postContollerClient.getPost();
	}

	@Bean
	public PostContollerClient postContollerClient(){
		return  new PostContollerClient();
	}




}
