package com.mrvnflx.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mrvnf on 9/20/2016.
 */
@RefreshScope
@RestController
public class SpringMvcController {

    @Value("${spring.mvc.hello.message:Hello, SpringMvcController!}")
    private String helloMessage;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloMessage;
    }
}
