package com.qphone.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    //用服务的地址，写在application.yml的配置文件里
    @Value("${app.service-url}")
    private  String appServiceUrl;

    //为spring中请求调用的一个模版搜索
    @Autowired
    private RestTemplate restTemplate;

    public String helloService(String type){
        //调用服务的地址和参数拼接
        ResponseEntity result=restTemplate.postForEntity(appServiceUrl+"hello/"+type,null,String.class);
        return result.getBody().toString();
    }
}
