package com.zhaoqi.Test;

import com.zhaoqi.service.Test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("/test")
    String getName(){

        return testService.getName("Platform is msg");
    }
}
