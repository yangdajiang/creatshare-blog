package com.creatshare.servlet;

import com.creatshare.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 15114 on 2017/7/23.
 */
@WebServlet(name = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String userName = request.getParameter("name");
        String userPass = request.getParameter("pass");

        LoginService service = new LoginService();

        try {
            if(service.confirmUser(userName,userPass)){
                String name = userName;
                String pass = userPass;

                request.setAttribute("name", name);
                request.setAttribute("pass", pass);

                request.getRequestDispatcher("welcome.jsp").forward(request, response);
            }
            else{
                System.out.println("用户名或密码错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
