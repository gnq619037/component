package com.gnq.component.optilock.controller;

import com.gnq.component.bean.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guonanqing
 * @desc:
 * @date: 2020/6/11
 */
@RestController
public class LoginController {

    @PostMapping("/login")
    public Object login(User user){
        System.out.println(user.getUsername()+":"+user.getPassword());
        return true;
    }
}
