package com.lzh.springcloud;

/**
 * @ClassName PaymentMain8004
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/6/30 22:33
 * @Version 1.0
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
