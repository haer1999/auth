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
public class Permission {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer pid;
    @Column
    private String path;
}
