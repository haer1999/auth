package com.example.auth.controller;

import com.example.auth.entity.Permission;
import com.example.auth.entity.User;
import com.example.auth.service.PermissionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PermissionController {

    @Autowired
    PermissionService permissionService;

    @GetMapping("/getPermissionList")
    @ResponseBody
    public List<Permission> getPermission(HttpServletRequest request) throws Exception{
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        List<Permission> permissionList = new ArrayList<>();
        if (user != null) {
            permissionList = permissionService.getPermissionList(user.getId());
        }
        return permissionList;
    }

}
