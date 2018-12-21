package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangbin on 2018/12/21.
 */
@RestController
@RequestMapping
public class HelloControler {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() {
        return "Hello,world!";
    }
}
