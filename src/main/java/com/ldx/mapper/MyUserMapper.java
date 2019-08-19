package com.ldx.mapper;

import com.github.pagehelper.Page;
import com.ldx.bean.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;


@Mapper
public interface MyUserMapper {
    user selectAllUserData();

    Page<Map<String, Object>> selectUserByUserName();
}
