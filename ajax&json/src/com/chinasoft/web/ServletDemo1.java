package com.chinasoft.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkUsername")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");

        Random random = new Random();
        int i = random.nextInt(10);
        String uname = i%2 == 0?"jack":"lily";

        if (username.equals(uname)){
            resp.getWriter().write("该用户已经被注册");
        }else {
            resp.getWriter().write("用户名正确");
        }


    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
