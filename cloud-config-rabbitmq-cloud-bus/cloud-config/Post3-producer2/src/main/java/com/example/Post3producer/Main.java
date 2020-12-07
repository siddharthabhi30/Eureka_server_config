package com.example.Post3producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component

public class Main {


    @Value("${eureka.client.serviceUrl.defaultZone:not workings}")
    private  String res;


    public String  print(){
        return res;
    }
}
