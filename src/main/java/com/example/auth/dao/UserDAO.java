package com.example.auth.dao;

import com.example.auth.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * created by cxming on 2019/6/5
 */
@Mapper
public interface UserDAO {

    @Insert("INSERT INTO user(username, password, role_id) VALUES(#{username}, #{password}, #{roleId} )")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(User user);

    @Select("select * from user where username=#{username} and password=#{password}")
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
