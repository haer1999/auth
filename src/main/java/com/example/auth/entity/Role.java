package com.example.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * created by cxming on 2019/6/6
 */
@Entity
public class Role {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;
}
