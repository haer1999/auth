package com.example.auth.service;

import com.example.auth.dao.UserDAO;
import com.example.auth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by cxming on 2019/6/30
 */
@Service
public class AuthService {

    @Autowired
    UserDAO userDAO;

    public User login(String username, String password) {
        return userDAO.selectByUsernameAndPassword(username, password);
    }

}
