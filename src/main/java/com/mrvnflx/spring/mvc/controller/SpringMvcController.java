package com.mrvnflx.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mrvnf on 9/20/2016.
 */
@Controller
public class SpringMvcController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody public String hello() {
        return "Hello, SpringMvcController!";
    }
}
