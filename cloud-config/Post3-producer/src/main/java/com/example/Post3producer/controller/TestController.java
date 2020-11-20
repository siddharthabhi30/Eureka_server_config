package com.example.Post3producer.controller;


import com.example.Post3producer.model.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {



	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public Post firstPage() {

		Post post = new Post();
		post.setData("new data");
		return post;
	}

}