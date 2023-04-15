package com.example.demo.demo.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.demo.entity.Country;

@Mapper
public interface CountryMapper {
  List<Country> selectAll();
}
