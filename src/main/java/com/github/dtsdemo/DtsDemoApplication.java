package com.github.dtsdemo;

import com.github.dtsdemo.util.DemoMessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DtsDemoApplication {

    private static volatile long startUp;

    public static void main(String[] args) {
        SpringApplication.run(DtsDemoApplication.class, args);

        startUp = System.currentTimeMillis();
    }

    public static boolean isStartup() {
        return startUp > 0L;
    }

    /**
     * 钉钉报警
     */
    @Bean
    public DemoMessageService messageService() {
        return new DemoMessageService();
    }
}
