package com.lzh.springcloud.controller;

import com.lzh.springcloud.entities.CommonResult;
import com.lzh.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/6/29 21:32
 * @Version 1.0
 **/
@Slf4j
@RestController
public class OrderController {
//    public static  final String PAYMENT="http://127.0.0.1:8001";
    public static final String PAYMENT = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    //    http://localhost/consumer/payment/get/1
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id ){
        return  restTemplate.getForObject(PAYMENT+"/payment/get/"+id,CommonResult.class);

    }


//http://localhost/consumer/payment/create/?serial=777
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return  restTemplate.postForObject(PAYMENT+"/payment/create",payment, CommonResult.class);
    }


}
