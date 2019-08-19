package com.ldx.mapper;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;


@Mapper
public interface MyToolMapper {

    Page<Map<String, Object>> selectAllToolData();
}
