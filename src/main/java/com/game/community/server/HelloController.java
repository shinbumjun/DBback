package com.game.community.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        System.out.println("22222222222222222");
        model.addAttribute("data", "hello!!!");
        return "hello"; // 화면 이름
    }
}