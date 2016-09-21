package com.mrvnflx.spring.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by mrvnf on 9/20/2016.
 */
@SpringBootApplication
@ComponentScan
public class SpringMvcApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
}
