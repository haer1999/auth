package com.example.auth.controller;

import com.example.auth.entity.User;
import com.example.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by cxming on 2019/6/5
 */
@RestController
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

}
