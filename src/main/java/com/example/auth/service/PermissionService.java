package com.example.auth.service;

import com.example.auth.dao.PermissionDAO;
import com.example.auth.dao.UserDAO;
import com.example.auth.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {

    @Autowired
    PermissionDAO permissionDAO;

    public List<Permission> getPermissionList(int userId) {
        return permissionDAO.selectByUserId(userId);
    }

}
