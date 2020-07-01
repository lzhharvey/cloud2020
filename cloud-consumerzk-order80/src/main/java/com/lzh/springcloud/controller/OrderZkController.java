package com.lzh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderZkController
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/6/30 23:19
 * @Version 1.0
 **/
@RestController
public class OrderZkController {
    public static final String INVOME_URL = "http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/zk")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
        return result;
    }
}
