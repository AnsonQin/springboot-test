package com.ansonqin.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @RequestMapping("/test")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/success")
    public String success(){
        return "hello success";
    }

}
