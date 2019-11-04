package com.signet.controller;

import com.signet.sync.SyncService;
import com.signet.sync.impl.SyncServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    //@Autowired
    //SyncService syncService;

    @Autowired
    SyncServiceImpl syncService;

    @RequestMapping("/001")
    public String test01() {
        int i = 1 / 1;
        System.out.println(Thread.currentThread().getName());
        syncService.test02(123);
        return "hello";
    }




}
