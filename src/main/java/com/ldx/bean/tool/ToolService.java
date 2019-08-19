package com.ldx.bean.tool;


import com.github.pagehelper.Page;

import java.util.Map;

public interface ToolService {

    Page<Map<String, Object>> selectAllToolData();
}
