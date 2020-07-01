package com.lzh.springcloud.service;

import com.lzh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/6/29 0:35
 * @Version 1.0
 **/
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id")Long id);
}
