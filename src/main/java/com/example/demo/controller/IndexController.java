package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangbin on 2018/12/21.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
