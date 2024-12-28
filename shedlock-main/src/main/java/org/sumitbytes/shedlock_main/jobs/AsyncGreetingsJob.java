package org.sumitbytes.shedlock_main.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class AsyncGreetingsJob {

    @Async("asyncTaskExecutor")
    @Scheduled(fixedDelay = 2000)
    public void asyncGreetingsJob() throws InterruptedException {
        log.info("Thread name: {}", Thread.currentThread().getName());
        log.info("Hello Async champs !!! Greetings for the day its {}, have a good day ahead :)", LocalDateTime.now());
        Thread.sleep(50000);
    }
}
