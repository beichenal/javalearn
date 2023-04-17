package com.example.demo.demo.entity;

import java.util.Date;

import lombok.Data;


@Data
public class SysRole {
   /**
     * 角色ID
     */
    private Long id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 有效标志
     */
    private Integer enabled;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    private SysUser user;
}
