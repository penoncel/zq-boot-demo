package com.zhaoqi.service.Test;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getName() {
        return "qwe";
    }
}
