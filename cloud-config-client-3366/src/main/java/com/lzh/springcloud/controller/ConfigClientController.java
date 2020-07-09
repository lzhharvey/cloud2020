package com.lzh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//将配置信息以rest风格暴露
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo+" "+port;
    }
}
