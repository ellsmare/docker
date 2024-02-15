package com.news;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String test(){
        return "test 시작";
    }

    @GetMapping("/")
    public String index(){
        return "메인페이지";
    }
    

}
