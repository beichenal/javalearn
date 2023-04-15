package com.example.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.entity.Country;
import com.example.demo.demo.mapper.CountryMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api")
public class CountryController {

  private static final Logger log = LoggerFactory.getLogger(CountryController.class);

  @Autowired
  CountryMapper countryMapper;

  @GetMapping("/countries")
  public List<Country> getAllCountry() {
    log.info("查询开始");
    return countryMapper.selectAll();
  }
}
