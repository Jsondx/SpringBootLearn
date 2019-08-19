package com.ldx.base;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class BaseHttpServlet extends HttpServlet {
    @Override
    public void init() {
        initData();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        initResponse(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        initResponse(req, resp);
    }

    protected abstract void initData();

    protected abstract void initResponse(HttpServletRequest req, HttpServletResponse resp);

    /**
     * 设置输出个事
     *
     * @param response
     * @return
     */
    private HttpServletResponse setRequestType(HttpServletResponse response) {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        return response;
    }

    /**
     * 内置发送消息
     *
     * @param req
     * @param resp
     * @param message
     */
    protected void printMessage(HttpServletRequest req, HttpServletResponse resp, String message) {
        setRequestType(resp);
        PrintWriter out = null;
        try {
            out = resp.getWriter();
            out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
