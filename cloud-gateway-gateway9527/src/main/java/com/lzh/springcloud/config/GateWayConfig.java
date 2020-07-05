package com.lzh.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //id->path_rote_atguigu  相当于配置文件里配的id
        //第二个地址表示localhost:9527/guonei,将转发到地址http://news.baidu.com/guonei
        routes.route("path_rote_atguigu",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("path_rote_atguigu1",
                r -> r.path("/game").uri("http://news.baidu.com/game")).build();
        return routes.build();
    }
}
 