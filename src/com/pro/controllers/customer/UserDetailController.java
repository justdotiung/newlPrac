package com.pro.controllers.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.dao.UserDAO;
import com.pro.entity.User;

public class UserDetailController {
	// 자바코드 pojo class
	public void excute(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		
		UserDAO dao = new UserDAO();
		User user = dao.getUser(id);
	}

}
