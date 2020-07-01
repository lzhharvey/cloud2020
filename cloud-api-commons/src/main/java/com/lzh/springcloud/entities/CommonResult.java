package com.lzh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//传给前端的类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //类似404的编码
    private Integer code;
    //消息 比如：success
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
