package com.pro.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.UserDAO;
@WebServlet("/mio")
public class Detail extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		UserDAO user = new UserDAO();
		req.setAttribute("user", user.getUser(id));
		req.getRequestDispatcher("/noticeDetail.jsp").forward(req,resp);
	}
}
