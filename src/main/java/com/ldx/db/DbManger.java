package com.ldx.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 弃用了。mavn 项目不需要db 类。直接用application.properties 即刻连接数据库
 */
@Deprecated
public class DbManger {
    private static DbManger dbManger = null;
    //?serverTimezone=GMT%2B8&useSSL=false 声明地区格式
    private static final String url = "jdbc:mysql://180.76.118.80:3306/test?serverTimezone=GMT%2B8&useSSL=false&useUnicode=true&characterEncoding=utf-8&characterSetResults=utf-8";
    private static final String name = "com.mysql.cj.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "root";
    private Connection connection;
    private PreparedStatement preparedStatement;

    public static DbManger getInstance() {
        if (dbManger == null) {
            synchronized (DbManger.class) {
                dbManger = new DbManger();
            }
        }
        return dbManger;
    }

    public void initDbManger(String sql) {
        try {
            Class.forName(name);
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void close() {
        try {
            this.connection.close();
            this.preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
