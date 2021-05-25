package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mars on 2021/5/25 10:16
 */
@RestController
@SpringBootApplication(proxyBeanMethods = false)
public class GraalvmApp {

    /**
     * start server
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(GraalvmApp.class, args);
    }

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name + "!";
    }

}
