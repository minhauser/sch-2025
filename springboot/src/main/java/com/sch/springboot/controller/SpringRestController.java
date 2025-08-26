package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    //@ResonseBody 생략 가능 <-- @RestController
    @GetMapping("/spring-api")
    public Member springApi(){

        Member member = new Member();
        member.setName("이지성");
        member.setAge(25);
        member.setAddress("아산 시");
        member.setSubject("스프링부트");
            return member;}
}
