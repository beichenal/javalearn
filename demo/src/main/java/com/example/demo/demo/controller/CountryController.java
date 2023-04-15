package com.example.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.entity.Country;
import com.example.demo.demo.mapper.CountryMapper;

@RestController
@RequestMapping("/api")
public class CountryController {

  @Autowired
  CountryMapper countryMapper;

  @GetMapping("/countries")
  public List<Country> getAllCountry() {
    return countryMapper.selectAll();
  }
}
