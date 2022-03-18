package org.shi.code.reading.springboot.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class MyAllApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("MyAllApplicationListener, 接收到的事件: {}", event);
    }
}
