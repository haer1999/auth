package com.example.auth.service;

import com.example.auth.dao.UserDAO;
import com.example.auth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by cxming on 2019/6/5
 */
@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public Object addUser(String username, String password, int roleId) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRoleId(roleId);
        Integer count = userDAO.save(user);
        System.out.println("count:" + count);
        System.out.println(user.getId());
        return null;
    }

}
