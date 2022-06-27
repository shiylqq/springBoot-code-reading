package org.shi.code.reading.springboot;

import org.shi.code.reading.springboot.listeners.MyEvent;
import org.shi.code.reading.springboot.starter.StarterApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PureBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PureBootApplication.class, args);

        applicationContext.publishEvent(new MyEvent(applicationContext));
    }
}
