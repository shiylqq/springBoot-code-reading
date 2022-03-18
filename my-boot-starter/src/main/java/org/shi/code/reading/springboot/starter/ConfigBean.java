package org.shi.code.reading.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "shi.starter.conf")
public class ConfigBean {

    /**
     * 当前项目配置的属性值
     */
    private String current;
    /**
     * 来自哪个starter的配置
     */
    private String from;

    @Override
    public String toString() {
        return "ConfigBean{" +
                "current='" + current + '\'' +
                ", from='" + from + '\'' +
                '}';
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
