package com.sch.springboot.controller;

import com.sch.springboot.dto.User;
import com.sch.springboot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    UserService userService = new UserService();

    @ResponseBody
    @PostMapping("/login")
    public String login(User user) {
        return userService.login(user);
    }

    @ResponseBody
    @PostMapping("/signup")
    public User signup(User user) {
        return user;
    }
}
