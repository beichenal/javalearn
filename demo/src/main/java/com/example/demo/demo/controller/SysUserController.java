package com.example.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
