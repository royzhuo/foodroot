package com.controller;

import com.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by roy.zhuo on 2018/9/17.
 */

@Controller
@RequestMapping("/haha")
public class fwebController {

    @Autowired
    private BaseService baseService;

    public fwebController(){
        System.out.println("fweb controller .................");
    }


    @RequestMapping(value = "/ha",method = RequestMethod.GET)
    public String haha(@RequestParam(value = "ll",required = false)String ll){
        System.out.println("ll:"+ll);
        baseService.happy(ll);
        return "home";
    }

    @RequestMapping(value = "/ha2",method = RequestMethod.GET)
    @ResponseBody
    public String haha2(@RequestParam(value = "name",required = false)String name){
        baseService.happy(name);
        return name;
    }
}
