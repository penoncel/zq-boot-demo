package com.zhaoqi;

import com.zhaoqi.service.Test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: zq-boot-demo
 * @Description: 测试
 * @Author: 赵旗
 * @Create: 2021-01-26 12:35
 */
@RestController
public class Test {
    @Autowired
    TestService testService;

    @RequestMapping("/order")
    String order(){
        return "Helllo~"+testService.getName("订单信息");
    }
}
