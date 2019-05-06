package com.doone.pudong.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.doone.pudong.mapper.IndexMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class IndexService {
    @Resource
    private IndexMapper indexMapper;

    public List<Map<String,Object>> query(){
        return indexMapper.query();
    }

    @DS("slave_1")
    public List<Map<String,Object>> queryIndexMapCount(){
        return indexMapper.queryIndexMapCount();
    }

}
