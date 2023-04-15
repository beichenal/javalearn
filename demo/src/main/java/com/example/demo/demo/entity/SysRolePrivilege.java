package com.example.demo.demo.entity;

import lombok.Data;

@Data
public class SysRolePrivilege {
   /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long privilegeId;
}
