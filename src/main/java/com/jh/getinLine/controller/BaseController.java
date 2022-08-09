package com.jh.getinLine.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice(basePackageClasses = BaseController.class)
//BaseController가 속해있는 패키지 =? Admin~Place까지 + api폴더 안에 있는 파일들 까지
@Controller
public class BaseController  { // application.properties 설정에서 기본 error페이지를 적용을 해제 했지만 완벽히 해제된건 x
                                                        // ErrorController를 implements 하지 않으면 /error가 중복된다고 에러가 뜬다
    @GetMapping("/")
    public String root() throws Exception{
        throw new Exception("테스트");
   //     return "index";
    }

//    @RequestMapping("/error")
//    public String error(){
//        return "error";
//    }

}
