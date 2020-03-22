package com.uzdz.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.uzdz.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference
    UserService userService;

    @GetMapping("/getUser")
    public Object getUser() {
        return userService.getUser("1");
    }
}
