package com.ldx.utils;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PageToJsonUtils {

    //Object泛型为object,这样没有转义符
    public static List<Object> toJsonList(Page<Map<String, Object>> mapPage) {
        List<Object> jsonList = new ArrayList<Object>();
        List<Map<String, Object>> result = mapPage.getResult();
        for (Map<String, Object> stringObjectMap : result) {
            //通过fastjson 转成object 没有转义符。
            jsonList.add(JSON.toJSON(stringObjectMap));
        }
        return jsonList;
    }

}
