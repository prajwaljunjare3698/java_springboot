package com.tut.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Std {
	@Id
	private int sid;
	
	private String sname;
	
	private String smail;
	
	public Std() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Std(int sid, String sname, String smail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smail = smail;
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
	public String getSmail() {
		return smail;
	}
	public void setSmail(String smail) {
		this.smail = smail;
	}
	@Override
	public String toString() {
		return "Std [sid=" + sid + ", sname=" + sname + ", smail=" + smail + "]";
	}
	
	
}
