package com.ldx.bean.user;

import com.github.pagehelper.Page;
import com.ldx.mapper.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private MyUserMapper user;//注入UserDao

    @Override
    public user selectAllUserData() {
        return user.selectAllUserData();
    }

    @Override
    public Page<Map<String, Object>> selectUserByName() {
        return user.selectUserByUserName();
    }


}
