package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class SpringController {
    @GetMapping("/spring")
    public String spring(@RequestParam("name")  String name,
                         @RequestParam("age") int age,
                         Model model) {
        System.out.print(name);
        System.out.println(age);//서버 콘솔에 출력

        //model 객체 추가 --> view 전달
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "spring"; //view name
    }
}
