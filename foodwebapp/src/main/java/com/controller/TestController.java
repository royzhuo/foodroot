package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by roy.zhuo on 2018/9/14.
 */

@Controller
@RequestMapping("/test")
public class TestController {
    public TestController() {
        System.out.println("create -------------------------------------------------------------------------------------------");
    }

    @RequestMapping(name = "/isOk",method = RequestMethod.POST)
    @ResponseBody
    public String testOk(@RequestParam(value = "name")String name){
        System.out.println("name:"+name);
        return name;
    }
}
