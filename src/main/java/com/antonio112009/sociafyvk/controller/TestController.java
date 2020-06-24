package com.antonio112009.sociafyvk.controller;

import com.antonio112009.sociafyvk.service.GroupAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    GroupAuth groupAuth;

    @GetMapping("/test")
    public String getTest(){
//        groupAuth.test();
        return "works";
    }
}
