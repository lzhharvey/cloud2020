package com.lzh.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/7/2 12:36
 * @Version 1.0
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //默认轮询，现在改为随机策略
//        return new RandomRule();
        return new RoundRobinRule();
    }
}
