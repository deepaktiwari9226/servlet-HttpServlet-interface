package com.Servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;
public class Third_Servlet_Using_Http_Servlet  extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Do get method");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Do post method");
	}

}
