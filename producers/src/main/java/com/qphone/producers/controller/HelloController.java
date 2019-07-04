package com.qphone.producers.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("hello/{type}")
    public String providerService(@PathVariable String type){
        return type+":我是一个暴露的服务";
    }

}
