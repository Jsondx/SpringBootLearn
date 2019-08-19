package com.ldx.bean.tool;


import com.github.pagehelper.Page;
import com.ldx.mapper.MyToolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class ToolServiceImp implements ToolService {
    @Autowired
    private MyToolMapper toolMapper;

    @Override
    public Page<Map<String, Object>> selectAllToolData() {
        return toolMapper.selectAllToolData();
    }
}
