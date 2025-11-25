package com.telusko;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet   (HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Hello from HelloServlet");
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<h1>Hello from HelloServlet</h1>");
    }
}
