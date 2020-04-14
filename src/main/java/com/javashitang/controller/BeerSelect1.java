package com.javashitang.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns="/select")
public class BeerSelect1 extends HttpServlet {

    /*
     * servlet的基本使用
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("step into doGet");
        //使用doPost来处理Http请求，因为Html表单指出method = POST
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("hello");
    }
}
