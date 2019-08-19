package com.ldx;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.ldx.bean.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
class HelloController {

    @Autowired
    private UserService userService;//注入Service

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        List<Object> jsonList = new ArrayList<Object>();
        String message = "";
        Page<Map<String, Object>> mapPage = userService.selectUserByName();
        List<Map<String, Object>> result = mapPage.getResult();
        for (Map<String, Object> stringObjectMap : result) {
            jsonList.add(JSON.toJSON(stringObjectMap));
        }
        message = "{\"menuList\":" + JSON.toJSONString(jsonList) + "}";
        return message;
    }


}