package com.example.demo.Scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@EnableScheduling
public class Scheduler {

    Logger logger = LoggerFactory.getLogger(Scheduler.class);
    @Scheduled(fixedDelay = 3000)
//    @Scheduled(cron = "*/2 * * * * ?")
    public void anything(){
        System.out.println("print something");
        logger.error("This is our Error message");
    }

}
