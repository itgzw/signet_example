package com.signet.feign;

import com.signet.fallback.TestFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "signet-A",fallback= TestFallback.class)
@Component
public interface ITestService {
    @RequestMapping("/test/001")
    String test01();
}
