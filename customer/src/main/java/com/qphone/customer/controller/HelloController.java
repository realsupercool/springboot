package com.qphone.customer.controller;

import com.qphone.customer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //注入刚才编写调用服务的service类
    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String consumerService(String type) {
        String result = helloService.helloService(type);
        return result;
    }
}
