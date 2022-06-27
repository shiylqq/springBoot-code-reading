package org.shi.code.reading.springboot.starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableConfigurationProperties(ConfigBean.class)
@PropertySource(value = "classpath:mystarter.yml")
@Configuration
public class MyStarter {

    //这里读不到classpath下面的配置文件...
    @Value("${shi.starter.conf.from:}")
    private String name;

    @Bean
    public StarterPerson starterPerson(){
        return new StarterPerson(name, 30);
    }

}
