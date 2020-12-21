package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldControl {
    @RequestMapping("/helloworld")

    public String index( ){

        return "Hello World!欢迎使用idea!!";
    }
}
