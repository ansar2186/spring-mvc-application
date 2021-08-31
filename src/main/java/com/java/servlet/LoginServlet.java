//package com.java.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//
///*
// * Browser sends Http Request to Web Server
// * 
 
 // * JEE with Servlets
// * 
// * Web Server responds with Http Response
// */
//
////Java Platform, Enterprise Edition (Java EE) JEE6
//
////Servlet is a Java programming language class 
////used to extend the capabilities of servers 
////that host applications accessed by means of 
////a request-response programming model.
//
////1. extends javax.servlet.http.HttpServlet
////2. @WebServlet(urlPatterns = "/login.do")
////3. doGet(HttpServletRequest request, HttpServletResponse response)
////4. How is the response created?
//
//@WebServlet(urlPatterns = "/login.do")
//public class LoginServlet extends HttpServlet {
//
//	private LoginService service = new LoginService();
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
//
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//
//		boolean validateUser = service.validateUser(name, password);
//
//		if (validateUser) {
//			request.setAttribute("name", request.getParameter("name"));
//			request.getRequestDispatcher("/WEB-INF/jsp/Welcome.jsp").forward(request, response);
//		} else {
//			request.setAttribute("errorMessage", "Invalid Credentials!!");
//			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
//		}
//
//		
//	}
//
//}