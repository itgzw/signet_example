package com.signet.fallback;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.signet.exception.MyException;
import com.signet.feign.ITestService;
import org.springframework.stereotype.Component;

@Component
public class TestFallback implements ITestService {

    @HystrixCommand(fallbackMethod = "get",commandKey = "test01")
    public String test01(){
        int i = 1/0;
        return "返回错误";
    }


    public void get(){
       throw new MyException("未知错误");
    }
}
