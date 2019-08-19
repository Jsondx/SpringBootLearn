package com.ldx.bean.user;

import com.github.pagehelper.Page;

import java.util.Map;

public interface UserService {

    user selectAllUserData();

    Page<Map<String, Object>> selectUserByName();

}
