package com.signet.sync.impl;

import com.signet.sync.SyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SyncServiceImpl /*implements SyncService*/{
    //@Override
    @Async("taskExecutor")
    public void test02(Integer i){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + i);
    }
}
