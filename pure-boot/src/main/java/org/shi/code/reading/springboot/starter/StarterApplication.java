package org.shi.code.reading.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StarterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApplication.class, args);

        StarterPerson bean = context.getBean(StarterPerson.class);
        System.out.println("自动注入的名字" + bean);
        ConfigBean configBean = context.getBean(ConfigBean.class);
        System.out.println("获取到的配置信息:" + configBean);
    }
}
