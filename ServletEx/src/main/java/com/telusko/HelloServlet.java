package com.telusko;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("Hello from HelloServlet");
//        res.setContentType("text/plain");
//        res.getWriter().write("Hello from HelloServlet");
    }
}
