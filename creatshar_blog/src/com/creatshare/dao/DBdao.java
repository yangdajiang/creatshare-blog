package com.creatshare.dao;

import com.creatshare.domain.User;
import com.creatshare.util.DbUtil;

import java.sql.*;

/**
 * Created by 15114 on 2017/7/19.
 */
public class DBdao {

    public void addUser(User user) throws Exception {
        Connection conn = DbUtil.getConnection();
        String sql = "INSERT INTO administrator (user_name, password)" +
                "VALUES (?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,user.getUsername());
        pstmt.setString(2,user.getPassword());
        pstmt.executeUpdate();
        DbUtil.closeConn(conn,pstmt,null);
    }

    public User findUserByNmae(String username) throws Exception {
        Connection conn = DbUtil.getConnection();
        User user = new User();
        String sql = "SELECT * FROM administrator WHERE user_name = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            user.setId(rs.getInt(1));
            user.setUsername(rs.getString(2));
            user.setPassword(rs.getString(3));
        }
        DbUtil.closeConn(conn,pstmt,rs);
        return user;
    }

  /* public static void main(String[] args) throws Exception {
        DBdao dao = new DBdao();
        User user = new User();
        user.setUsername("yangda");
        user.setPassword("19980825");
        dao.addUser(user);
        System.out.println(user.toString());

    }*/
}
