package com.tut1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentData {
	@Id
	private int sid;
	
	@Column(length=20)
	private String sname;
	
	@Column(length=20)
	private String semail;
	
	private Certificate certi;
	
	public StudentData() {
		
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

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "StudentData [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", certi=" + certi + "]";
	}

	
}
