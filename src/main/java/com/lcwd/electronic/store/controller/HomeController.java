package com.lcwd.electronic.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class  HomeController {
    @GetMapping
    public String testing(){
        return "Welcome to electronic store";
    }
    //dekhu to jara pull ho rha hai ki nahi!!!!!!

}
