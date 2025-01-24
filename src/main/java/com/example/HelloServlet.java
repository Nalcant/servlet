package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    String message;

    @Override
    public void init() {
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //tipo de resposta
        response.setContentType("text/html");

        //logica
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    @Override
    public void destroy() {
        //do nothing
    }
}
