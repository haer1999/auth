package com.example.auth.dao;

import com.example.auth.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

/**
 * created by cxming on 2019/6/5
 */
@Mapper
public interface UserDAO {

    @Insert("INSERT INTO t_user(username, password, role_id) VALUES(#{username}, #{password}, #{roleId} )")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(User user);

}
