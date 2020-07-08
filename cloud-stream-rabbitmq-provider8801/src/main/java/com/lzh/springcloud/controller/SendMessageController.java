package com.lzh.springcloud.controller;

import com.lzh.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SendMessageController
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/7/7 23:35
 * @Version 1.0
 **/
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider messageProvider;
    @GetMapping(value = "/sendMessage")
    public String send(){
        return messageProvider.send();
    }
}
