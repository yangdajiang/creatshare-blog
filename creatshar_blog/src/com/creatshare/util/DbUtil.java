package com.creatshare.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.*;

/**
 * Created by 15114 on 2017/7/22.
 */
public class DbUtil {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    public static Connection getConnection() throws SQLException, PropertyVetoException {
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cs_blog");
        dataSource.setUser("root");
        dataSource.setPassword("qazwsxedc");
        return dataSource.getConnection();
    }
    public static void closeConn(Connection conn, PreparedStatement pstmt , ResultSet rs ){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(pstmt != null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}