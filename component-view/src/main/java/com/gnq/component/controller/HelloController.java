package com.gnq.component.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: guonanqing
 * @desc:
 * @date: 2020/6/11
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public Object hello(){
        return "hello";
    }
}
