package com.zhaoqi;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 改变项目启动方式
 * 创建一个java类ServletInitializer，
 * 继承SpringBootServletInitializer，
 * 重写其configure方法，
 * 并通过builder.sources(WeixinTestApplication.class)
 * 将SpringBoot工程的启动类（比如我的启动类名为WeixinTestApplication）传进去：
 *
 * @author HP*/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TemplateQbootWebAppApiApplication.class);
    }
}
