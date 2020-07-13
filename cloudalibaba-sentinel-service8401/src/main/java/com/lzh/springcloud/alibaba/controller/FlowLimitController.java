package com.lzh.springcloud.alibaba.controller;



import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class FlowLimitController
{
    @GetMapping("/testA")
    public String testA() {
//        try {
//            TimeUnit.MILLISECONDS.sleep(900);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        log.info(Thread.currentThread().getName()+"\t"+"...testB");
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }



    @GetMapping("/testD")
    public String testD()
    {
        log.info("testD 测试RT");
        int age = 10/0;
        return "------testD";
    }

    //参数p1对应的索引是0，p2是1
    //通过SentinelResource注解指定资源名为testHotKey，不指定的话，默认以接口路径/testHotKey作为资源名
    //指定兜底方法deal_testHotKey
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        //int age = 10/0;
        return "------testHotKey";
    }
    //兜底方法
    public String deal_testHotKey (String p1, String p2, BlockException exception){
        //sentinel的默认提示：Blocked by sentinel（flow limiting）
        return "------deal_testHotKey,o(╥﹏╥)o";
    }
}
 
 
