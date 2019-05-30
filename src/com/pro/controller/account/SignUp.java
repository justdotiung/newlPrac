package com.pro.controller.account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.dao.AccountDAO;
import com.pro.entity.Account;
import com.pro.test.integerException.IntegerEx;

@WebServlet("/joinProc")
public class SignUp extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("uid");
		String pw = req.getParameter("pwd");
		String pw2 = req.getParameter("pwd2");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");

		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		// 문자열 형식 합치기
		String birth = String.format("%s-%s-%s", year, month, day);

		String lunar = req.getParameter("isLunar");
		String phone = req.getParameter("phone");
		String mail = req.getParameter("email");

		String[] habit = req.getParameterValues("habit");
		String a = "";
		AccountDAO dao = new AccountDAO();
		Account account = new Account();
		
		
		
		List<String> errors = new ArrayList<>();
		if (id == null || id.equals(""))
			errors.add("아이디가 입력되지않았습니다.");
		
		if (year == null || !IntegerEx.isNumber(year))
			errors.add("숫자만 입력가능합니다.");

		if (habit != null && habit.length > 1)
			for (int i = 0; i < habit.length; i++) {
				a += habit[i];
				if (habit.length > i + 1)
					a += ",";
			}

		if (!pw.equals(pw2))
			errors.add("비밀번호가 일치하지않습니다.");
		if (errors.size() > 0) {
			req.setAttribute("error", errors);
			req.getRequestDispatcher("/noticeJoin.jsp").forward(req, resp);
		}
		
		else {
			account = new Account(id, pw, name, gender, birth, lunar, phone, mail,a);
			dao.insert(account);
			
			resp.sendRedirect("index.jsp");
		}
		
	}

}
