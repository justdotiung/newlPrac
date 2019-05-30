package com.pro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.dao.UserDAO;
import com.pro.entity.User;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
@WebServlet("/proc")
public class ConInsert extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String t = req.getParameter("title");
	String c = req.getParameter("content");

	User user = new User();
	user.setContent(c);
	user.setTitle(t);
	
	UserDAO dao = new UserDAO();
	int result =dao.insert(user);
	
	if(result != 1)
		resp.sendRedirect("error");
	else 
		resp.sendRedirect("mo");
		
	}

}
