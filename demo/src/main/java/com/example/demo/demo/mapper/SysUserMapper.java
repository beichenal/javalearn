package com.example.demo.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.demo.entity.SysRole;
import com.example.demo.demo.entity.SysUser;

@Mapper
public interface SysUserMapper {
  List<SysUser> selectAll();

  /**
   * 根据用户id 获取角色信息
   */

  List<SysRole> selectRolesByUserId(Long userId);
}
