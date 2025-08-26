package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

    public class SpringController {

    @ResponseBody
    @GetMapping("/spring-apil")
    public String springApi(@ModelAttribute Member member){
        System.out.println(member.getName());
        System.out.println(member.getAge());

        return member.toString(); // 클라이언트 - String 문자열 전송
    }

    @GetMapping("/spring")
    public String spring(@RequestParam("name")  String name,
                         @RequestParam("age") int age,
                         Model model) {

        //model 객체 추가 --> view 전달
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "spring"; //view name
    }
}
