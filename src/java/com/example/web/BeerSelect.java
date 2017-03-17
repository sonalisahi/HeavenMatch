/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/**
 *
 * @author Sunny
 */
public class BeerSelect extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.println("Beer selection advice <br>");
        
        String c = request.getParameter("color");
        out.println("<br> Got beer color : " + c);
    }
}
