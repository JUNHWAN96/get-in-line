package com.jh.getinLine.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @GetMapping("/sing-up")
    public String signUp(){
        return"done."; // responsebody => view로 응답을 해주는게 x
    }

    @GetMapping("/login")
    public String login(){
        return"done."; // responsebody => view로 응답을 해주는게 x
    }

}
