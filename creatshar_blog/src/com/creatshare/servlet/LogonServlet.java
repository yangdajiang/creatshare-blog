package com.creatshare.servlet;

import com.creatshare.dao.DBdao;
import com.creatshare.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 15114 on 2017/7/22.
 */
@WebServlet(name = "/LogonServlet")
public class LogonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String username = request.getParameter("name");
        String password = request.getParameter("pass");
        user.setUsername(username);
        user.setPassword(password);

        DBdao dbdao = new DBdao();
        try {
            dbdao.addUser(user);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
