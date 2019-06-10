package com.example.auth.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * created by cxming on 2019/6/6
 */
@Data
@Entity
public class RolePermission {
    @Id
    private Integer id;
    @Column(name = "role_id", nullable = false)
    private Integer roleId;
    @Column(name = "permission_id", nullable = false)
    private Integer permissionId;

}
