package com.sch.springboot.service;

import com.sch.springboot.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * login : 로그인 비즈니스 로직 처리
     */

    public String login(User user) {
        System.out.println("UserService login -->");
        System.out.println(user.getId()+","+user.getPassword());
        return "userService --> login";
    }
    /**
     * signup: 회원 가입 비즈니스 로직 처리
     */
    public void signup(User user) {
        System.out.println("UserService signup -->");
        System.out.println(user.getId()
        +","+user.getPassword()
        +","+user.getEmail()
        +","+ user.getName());
        
    }
}
