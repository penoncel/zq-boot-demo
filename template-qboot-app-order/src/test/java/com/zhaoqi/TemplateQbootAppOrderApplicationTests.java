package com.zhaoqi;

import com.zhaoqi.service.Test.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplateQbootAppOrderApplicationTests {
    @Autowired
    TestService testService;
    @Test
    void contextLoads() {
        System.out.println(testService.getName("测试的这个是"));
    }

}
