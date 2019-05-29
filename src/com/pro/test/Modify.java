package com.pro.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.User;
import pro.UserDAO;
@WebServlet("/edit")
public class Modify extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		UserDAO user = new UserDAO();
		
		req.setAttribute("user", user.getUser(id));
		req.getRequestDispatcher("/noticeEdit.jsp").forward(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String c = req.getParameter("content");
		String t = req.getParameter("title");
		UserDAO user = new UserDAO();
		User u= user.getUser(id);
		u.setContent(c);
		u.setTitle(t);
		user.update(u);
		System.out.println(u.getTitle());
		System.out.println(user.update(u));
		req.setAttribute("user", user.getUser(id));
		req.getRequestDispatcher("/noticeDetail.jsp").forward(req,resp);
		
	}
}
