package org.shi.code.reading.springboot.mvc.simple1.controller;

import org.shi.code.reading.springboot.mvc.simple1.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @PostMapping("/user")
    public User getUser(@RequestBody User user){

        System.out.printf("收到请求：" + user);

        return user;
    }

}
