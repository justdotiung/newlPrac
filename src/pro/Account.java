package pro;

import java.util.Date;

public class Account {
	
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String isLunar;
	private String phone;
	private String mail;
	private String habit;
	private Date regdate;

	
	public Account() {
	
	}



	public Account(String id, String pw, String name, String gender, String birth, String isLunar, String phone,
		String mail, String habit) {
	super();
	this.id = id;
	this.pw = pw;
	this.name = name;
	this.gender = gender;
	this.birth = birth;
	this.isLunar = isLunar;
	this.phone = phone;
	this.mail = mail;
	this.habit = habit;
}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getIsLunar() {
		return isLunar;
	}

	public void setIsLunar(String isLunar) {
		this.isLunar = isLunar;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getHabit() {
		return habit;
	}

	public void setHabit(String habit) {
		this.habit = habit;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	
}
