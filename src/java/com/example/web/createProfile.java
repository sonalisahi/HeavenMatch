/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

/**
 *
 * @author Sunny
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class createProfile extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        
        RequestDispatcher view = request.getRequestDispatcher("form.jsp");
        view.forward(request, response);
        //response.setContentType("text/html");
        //response.sendRedirect("./form.jsp");
        //PrintWriter out = response.getWriter();
        //out.println("Create form <br>");
        
        //String c = request.getParameter("color");
        //String c = "Create form for adding new profile";
        //out.println("<br> Next task : " + c);
    }
}
