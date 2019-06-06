package com.example.auth.entity;

import lombok.Builder;
import lombok.Data;
import org.apache.ibatis.annotations.Options;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * created by cxming on 2019/6/5
 */
@Data
@Entity
public class User {
    @Id
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

}
