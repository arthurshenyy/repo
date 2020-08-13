package com.chinasoft;

import com.alibaba.fastjson.JSON;
import com.chinasoft.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
雷霆嘎巴, 无情哈啦搜 ZBC

@WebServlet("/demo2")
public class ServletDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String user = req.getParameter("user");
        System.out.println(user);
        User u = JSON.parseObject(user, User.class);
        System.out.println(u);
//        设置响应 让客户端以json的形式打开数据
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(JSON.toJSONString(u));


//        List<User>
//        Map<String,String[]>







    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
