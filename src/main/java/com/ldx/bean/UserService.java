package com.ldx.bean;

import com.github.pagehelper.Page;

import java.util.Map;

public interface UserService {

    user selectAllUserData();

    Page<Map<String, Object>> selectUserByName();

}
