package com.lzh.springcloud.controller;

import com.lzh.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentHystrixController
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/7/4 0:17
 * @Version 1.0
 **/
@RestController
public class PaymentHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_OK(id);
        return s;
    }
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_TimeOut(id);
        return s;
    }
}
