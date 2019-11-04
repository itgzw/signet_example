package com.signet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/001")
    public String test01(){
        int i = 1/0;
        return "hello";
    }
}
