package com.tut.caching;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentCache {
	@Id
	private int sid;	
	private String sname;
	private String splace;
	public StudentCache() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSplace() {
		return splace;
	}
	public void setSplace(String splace) {
		this.splace = splace;
	}
	@Override
	public String toString() {
		return "StudentCache [sid=" + sid + ", sname=" + sname + ", splace=" + splace + "]";
	}
	
}
