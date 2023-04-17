package com.example.demo.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.demo.entity.SysRole;
import com.example.demo.demo.entity.SysUser;

@Mapper
public interface SysUserMapper {
  List<SysUser> selectAll();

  /**
   * 根据用户id 获取角色信息
   */

  List<SysRole> selectRolesByUserId(Long userId);

  //新增用户
  int insert(SysUser sysUser);

  int insert2(SysUser sysUser);

  int insert3(SysUser sysUser);

  int updateById(SysUser sysUser);

  List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId, @Param("enabled") Integer enabled);
}
