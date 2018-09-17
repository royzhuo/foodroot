package com.service.impl;

import org.springframework.stereotype.Service;

/**
 * Created by roy.zhuo on 2018/9/14.
 */

@Service(value = "baseService")
public class BaseServiceImpl implements com.service.BaseService {
    @Override
    public void happy(String name) {
        System.out.println("name:"+name+" very happy");
    }
}
