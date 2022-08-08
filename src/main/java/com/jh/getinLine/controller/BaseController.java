package com.jh.getinLine.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController { // application.properties 설정에서 기본 error페이지를 적용을 해제 했지만 완벽히 해제된건 x
                                                        // ErrorController를 implements 하지 않으면 /error가 중복된다고 에러가 뜬다
    @GetMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}
