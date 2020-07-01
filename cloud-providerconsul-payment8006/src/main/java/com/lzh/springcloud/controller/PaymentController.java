package com.lzh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/6/30 22:35
 * @Version 1.0
 **/
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
