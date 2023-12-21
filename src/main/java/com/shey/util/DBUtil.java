package com.shey.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * DBUtil数据库工具类
 */
public class DBUtil {
    private static final DataSource dataSource;

    // 静态代码块，在类加载时执行，用于初始化数据源
    static {
        HikariConfig config = new HikariConfig("/db.properties");
        dataSource = new HikariDataSource(config);
    }

    /**
     * 获取数据库连接的方法
     *
     * @return 返回一个数据库连接对象
     * @throws SQLException 如果获取连接过程中出现错误
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 关闭数据库连接的方法
     *
     * @param connection 需要关闭的数据库连接对象
     * @throws SQLException 如果关闭连接过程中出现错误
     */
    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}

