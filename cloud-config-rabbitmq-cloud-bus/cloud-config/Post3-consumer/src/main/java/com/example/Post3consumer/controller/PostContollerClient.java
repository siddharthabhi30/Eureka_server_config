package com.example.Post3consumer.controller;
import java.io.IOException;
import java.util.List;

import com.example.Post3consumer.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;



public class PostContollerClient {

    @Autowired
    private DiscoveryClient discoveryClient;

    public void getPost() throws RestClientException, IOException{
        List<ServiceInstance> instances=discoveryClient.getInstances("post-producer");
        ServiceInstance serviceInstance=instances.get(0);

        String baseUrl=serviceInstance.getUri().toString();
        baseUrl=baseUrl+"/post";

        System.out.println("new url   " + baseUrl);
        RestTemplate restTemplate = new RestTemplate();
        RestTemplate restTemplate2 = new RestTemplate();
        Post myPost=restTemplate2.getForObject(baseUrl,Post.class);
        System.out.println("diff method");
        System.out.println(myPost);
        ResponseEntity<String> response=null;
        try{
            response=restTemplate.exchange(baseUrl,
                    HttpMethod.GET, getHeaders(),String.class);
        }catch (Exception ex)
        {
            System.out.println(ex);
        }
        System.out.println(response.getBody());

    }

    private static HttpEntity<?> getHeaders() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }


}
