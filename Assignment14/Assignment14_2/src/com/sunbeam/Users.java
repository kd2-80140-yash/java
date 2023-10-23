package com.sunbeam;

import java.util.Scanner;

public class Users {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private String date;
	private boolean status;
	private String role;
	
	public Users() {
	}
	
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id : ");
		this.id = sc.nextInt();
		System.out.print("Enter First name : ");
		this.fname = sc.next();
		System.out.print("Enter Last name : ");
		this.lname = sc.next();
		System.out.print("Enter Email : ");
		this.email = sc.next();
		System.out.print("Enter Password : ");
		this.pass = sc.next();
		System.out.print("Enter Date : ");
		this.date = sc.next();
		System.out.print("Enter Status(True or False) : ");
		this.status = sc.nextBoolean();
		System.out.print("Enter Role : ");
		this.role = sc.next();
	}
	public Users(int id, String fname, String lname, String email, String pass, String date, boolean status,
			String role) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.date = date;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
				+ ", date=" + date + ", status=" + status + ", role=" + role + "]";
	}
	
	
}