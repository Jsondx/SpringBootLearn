package com.ldx;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.ldx.bean.tool.ToolService;
import com.ldx.bean.user.UserService;
import com.ldx.utils.PageToJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
class HelloController {

    @Autowired
    private UserService userService;//注入Service
    @Autowired
    private ToolService toolService;

    private String message = "";

    @RequestMapping(path = "/userMessage", method = RequestMethod.GET)
    public String hello() {
        //用page 用来加载所有数据库数据的
        Page<Map<String, Object>> mapPage = userService.selectUserByName();
        List<Object> objects = PageToJsonUtils.toJsonList(mapPage);
        //通过拼接转成json 在前台展示
        message = "{\"menuList\":" + JSON.toJSONString(objects) + "}";
        return message;
    }

    @RequestMapping(path = "/toolMessage", method = RequestMethod.GET)
    private String toolMessage() {
        //用page 用来加载所有数据库数据的
        Page<Map<String, Object>> mapPage = toolService.selectAllToolData();
        List<Object> objects = PageToJsonUtils.toJsonList(mapPage);
        message = "{\"menuList\":" + JSON.toJSONString(objects) + "}";
        //通过拼接转成json 在前台展示
        return message;
    }

}