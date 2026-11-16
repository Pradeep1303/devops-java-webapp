package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>DevOps Java Web App</title></head><body>");
            out.println("<h1>Hello from my DevOps project!</h1>");
            out.println("<p>GitHub + Jenkins + Maven + Tomcat</p>");
            out.println("<p>Build and deployment practice successful.</p>");
            out.println("</body></html>");
        }
    }
}
