package com.pro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pro.entity.Account;

public class AccountDAO {
	public Connection getConnection() {
		String id = "scott";
		String pw = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, id, pw);
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
		
	public int insert(Account account) {
		String sql = "insert into member values(?,?,?,?,?,?,?,?,?,sysdate)";
		
		int result = 0;
		try {
			PreparedStatement ptmt = getConnection().prepareStatement(sql);
			ptmt.setString(1, account.getId());
			ptmt.setString(2, account.getPw());
			ptmt.setString(3, account.getName());
			ptmt.setString(4, account.getGender());
			ptmt.setString(5, account.getBirth());
			ptmt.setString(6, account.getIsLunar());
			ptmt.setString(7, account.getPhone());
			ptmt.setString(8, account.getMail());
			ptmt.setString(9, account.getHabit());
			result = ptmt.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
