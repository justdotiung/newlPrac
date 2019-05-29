package com.pro.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import pro.User;
import pro.UserDAO;
@WebServlet("/proc")
public class ConInsert extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String t = req.getParameter("title");
	String c = req.getParameter("content");
	System.out.println(t);
	User user = new User();
	user.setContent(c);
	user.setTitle(t);
	
	UserDAO dao = new UserDAO();
	int result =dao.insert(user);
	System.out.println(result);
	if(result != 1)
		resp.sendRedirect("error");
	else 
		resp.sendRedirect("mo");
		
	}

}
