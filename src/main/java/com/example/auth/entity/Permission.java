package com.example.auth.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

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
    private Integer zindex;
    @Column
    private Integer istype;
    @Column
    private String descrpt;
    @Column
    private String code;
    @Column
    private String icon;
    @Column
    private String page;
    @Column(name = "insert_time")
    private Date insertTime;
    @Column(name = "update_time")
    private Date updateTime;
}
