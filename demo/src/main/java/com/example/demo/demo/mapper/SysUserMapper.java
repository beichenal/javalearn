package com.example.demo.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.demo.entity.SysUser;

@Mapper
public interface SysUserMapper {
  List<SysUser> selectAll();
}
