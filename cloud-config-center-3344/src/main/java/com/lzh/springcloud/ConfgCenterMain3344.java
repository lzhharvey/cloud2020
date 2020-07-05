package com.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @ClassName ConfgCenterMain3344
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/7/5 17:34
 * @Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfgCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfgCenterMain3344.class,args);
    }

}
