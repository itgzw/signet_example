package com.signet.controller;

import com.signet.feign.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ITestService testService;

    @RequestMapping("/001")
    public String test01() {
        String s = testService.test01();
        System.out.println(s);
        return s;
    }

}
