package com.example.demo.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.entity.SysRole;
import com.example.demo.demo.entity.SysUser;
import com.example.demo.demo.mapper.SysUserMapper;

@RestController
@RequestMapping("/api")
public class SysUserController {

  @Autowired
  SysUserMapper sysUserMapper;

  @GetMapping("/users")
  public List<SysUser> getAllUser() {
    return sysUserMapper.selectAll();
  }

  @GetMapping("/roles")
  public List<SysRole> selectRolesByUserId(@RequestParam("id") Long id) {
    return sysUserMapper.selectRolesByUserId(id);
  }

  @GetMapping("/addUser")
  public int insertUser(){
    SysUser user = new SysUser();
    user.setUserName("test1");
    user.setUserPassword("123456");
    user.setUserEmail("test@mybatis.tk");
    user.setUserInfo("test info");
    user.setHeadImg(new byte[]{1,2,3});
    user.setCreateTime(new Date());
    return sysUserMapper.insert(user);
  }
}
