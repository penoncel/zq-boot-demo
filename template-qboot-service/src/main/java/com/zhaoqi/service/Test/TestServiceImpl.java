package com.zhaoqi.service.Test;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getName(String str) {
        return "This is "+ str + " , Times： "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
