package com.lzh.springcloud.controller;
 

import com.lzh.springcloud.domin.CommonResult;
import com.lzh.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.math.BigDecimal;
 
@RestController
public class AccountController {
    @Resource
    AccountService accountService;
    /**
     * 扣减账户余额
     */
    @PostMapping("/account/decrease")
    public CommonResult decrease( Long userId, BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
 
