package com.pro.test.account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/joinProc")
public class SignUp extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("uid");
		String pw = req.getParameter("pwd");
		String pw2 = req.getParameter("pwd2");
		String name = req.getParameter("name");
		String gender = req.getParameter("gander");
	
		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		//문자열 형식 합치기
		String birth = String.format("%s-%s-%s",year,month,day);
		
		String lunar = req.getParameter("isLunar");
		String phone = req.getParameter("phone");
		String mail = req.getParameter("email");
	
		String[] habit = req.getParameterValues("habit");
		String a ="";
		List<String> errors = new ArrayList<>();
		if(id == null || id.equals(""))
			errors.add("아이디가 입력되지않았습니다.");
//		if(habit == null){
//			req.setAttribute("error", "체크박스를 선택해주세요");
//			req.getRequestDispatcher("/noticeJoin.jsp").forward(req,resp);
//		}
		
		if(habit !=null && habit.length >1)
			for (int i = 0; i < habit.length; i++) {
				a += habit[i];
				if(habit.length> i+1)
					a += ",";
				
			}
		if(!pw.equals(pw2))
			req.setAttribute("error", "비밀번호가 일치하지않습니다.");
		req.getRequestDispatcher("/noticeJoin.jsp").forward(req,resp);
	}

}
