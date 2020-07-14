package com.lzh.springcloud.dao;

import com.lzh.springcloud.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/7/14 17:29
 * @Version 1.0
 **/
@Mapper
public interface OrderDao
{
    //新建订单
    void create(Order order);
    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
