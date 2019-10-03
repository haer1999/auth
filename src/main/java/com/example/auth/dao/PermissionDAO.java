package com.example.auth.dao;

import com.example.auth.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PermissionDAO {

    @Select("select p.* from permission p, role_permission rp, user_role ur where p.id = rp.permission_id " +
            "and rp.role_id = ur.role_id and ur.user_id = #{userId}")
    List<Permission> selectByUserId(int userId);

}
