package com.jspider.serializationClass;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -5001986549321810592L;
	
	int id;
	String userName;
	String password;
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
