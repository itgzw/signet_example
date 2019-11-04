package com.signet.sync;

import org.springframework.scheduling.annotation.Async;

public interface SyncService {
    @Async("taskExecutor")
    void test02(Integer i);
}
