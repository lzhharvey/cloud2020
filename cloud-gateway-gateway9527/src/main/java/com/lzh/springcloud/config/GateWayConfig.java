package com.lzh.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Configuration
public class GateWayConfig {
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //生成比当前时间早一个小时的UTC时间
        //当前时间：2020-07-05T12:19:02.779+08:00[Asia/Shanghai]
//        ZonedDateTime minusTime = LocalDateTime.of(2020,07,05,12,19,02).minusHours(1).atZone(ZoneId.systemDefault());
//
//        routes.route("payment_routh",
//                r -> r.path("/payment/get/** ").uri("lb://cloud-payment-service")).build();
//        routes.route("payment_routh2",
//                r -> r.path("/payment/lb/**").uri("lb://cloud-payment-service")).build();

        //id->path_rote_atguigu  相当于配置文件里配的id
        //第二个地址表示localhost:9527/guonei,将转发到地址http://news.baidu.com/guonei
//        routes.route("path_rote_atguigu",
//                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
//        routes.route("path_rote_atguigu1",
//                r -> r.path("/game").uri("http://news.baidu.com/game")).build();
//        return routes.build();
//    }
}
 