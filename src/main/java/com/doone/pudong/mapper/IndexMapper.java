package com.doone.pudong.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IndexMapper {


    List<Map<String,Object>> query();

    List<Map<String,Object>> queryIndexMapCount();

}
