package com.lzh.springcloud;

import com.lzh.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderMain08
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/6/29 21:29
 * @Version 1.0
 **/
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
@EnableEurekaClient
@SpringBootApplication
public class OrderMain08 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain08.class,args);
    }

}
