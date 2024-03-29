package com.example.auth.controller;

import com.example.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * created by cxming on 2019/6/5
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public Object addUser(@RequestParam(name = "username") String username,
                          @RequestParam(name = "password") String password,
                          @RequestParam(name = "roleId") Integer roleId) {
        userService.addUser(username, password, roleId);
        return "success";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/userList")
    public String toUserList() {
        return "/auth/userList";
    }

}
