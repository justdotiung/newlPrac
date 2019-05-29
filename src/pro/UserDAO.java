package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
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
	
	public List<User> list() {
		String sql = "select * from notices";
		List<User> list = new ArrayList<>();
		try {
			PreparedStatement ptmt = getConnection().prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				User user = new User(
						rs.getString("seq"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content"),
						rs.getDate("regdate"),
						rs.getInt("hit"));
					list.add(user);	
						}
				rs.close();
				ptmt.close();
				getConnection().close();
				return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public User getUser(String id) {
		String sql = "select * from notices where seq = ?";
		User user = null;
		try {
			PreparedStatement ptmt = getConnection().prepareStatement(sql);
			ptmt.setString(1, id);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				user = new User(
						rs.getString("seq"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content"),
						rs.getDate("regdate"),
						rs.getInt("hit"));
			}
			rs.close();
			ptmt.close();
			getConnection().close();
			return user;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int insert(User user) {
		String sql = "insert into notices values((select max(to_number(seq))+1 from notices),?,'newlec',?,systimestamp,0)";
		
		int result = 0;
		try {
			PreparedStatement ptmt = getConnection().prepareStatement(sql);
			ptmt.setString(1, user.getTitle());
			ptmt.setString(2, user.getContent());
			result = ptmt.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
