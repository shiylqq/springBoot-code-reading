package org.shi.code.reading.springboot.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

@Slf4j
public class MySpringApplicationListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {

        log.info("myEvent。。。。。。。。");
    }
}
