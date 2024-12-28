package org.sumitbytes.shedlock_main.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class GreetingsJob {

    @Scheduled(fixedDelay = 5000)
    public void greetingsJob(){
        log.info("Hello there !!! Greetings for the day its {}, have a good day ahead :)", LocalDateTime.now());
    }
}
