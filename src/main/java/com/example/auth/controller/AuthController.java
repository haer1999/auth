package com.example.auth.controller;

import com.example.auth.entity.User;
import com.example.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * created by cxming on 2019/6/30
 */
@Controller
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request) {
        User user = authService.login(username, password);
        if (user == null) {
            return "redirect:index.html";
        }
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        return "redirect:toHome";
    }

    @GetMapping("/toHome")
    public String home() {
        return "home";
    }

}
