package com.lzh.springcloud.controller;

import com.lzh.springcloud.entities.CommonResult;
import com.lzh.springcloud.entities.Payment;
import com.lzh.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/6/29 0:40
 * @Version 1.0
 **/
@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    //@RequestBody将前端发来的数据，绑定到入参中对应的属性上
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果："+result);
        if (result>0){
            return new CommonResult(200,"success：serverPort："+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据失败55555");
        }
    }
//    http://localhost:8001/payment/get/1
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long  id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果："+paymentById);
        if (paymentById!=null){
            return new CommonResult(200,"success：serverPort："+serverPort,paymentById);
        }else {
            return new CommonResult(444,"查询数据失败");
        }
    }

}
