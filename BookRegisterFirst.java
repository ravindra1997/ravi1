package com.techouts.firsttask;

import java.util.Scanner;

public class BookRegisterFirst {
	 String name;
	 String mailid;
	 String phonenumber;
	 String password;
	public String getName() {
		return name;
	}

	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber2) {
		this.phonenumber = phonenumber2;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name2) 
	{
		this.mailid=name2;
		
	}
	
	/*
	 * public void sell() { BookDisplay bookDisplay=new BookDisplay();
	 * 
	 * bookDisplay.displayBook();
	 * 
	 * }
	 */
}