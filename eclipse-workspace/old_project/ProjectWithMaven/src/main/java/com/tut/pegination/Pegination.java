package com.tut.pegination;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pegination {
	@Id
	@Column(name="E_id")
	int eid;
	
	@Column(name="e_Name")
	String ename;
	
	@Column(name="e_Age")
	int eage;
	
	@Column(name="e_Place")
	String eplace;

	public Pegination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pegination(int eid, String ename, int eage, String eplace) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.eplace = eplace;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEplace() {
		return eplace;
	}

	public void setEplace(String eplace) {
		this.eplace = eplace;
	}

	@Override
	public String toString() {
		return "Pegination [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eplace=" + eplace + "]";
	}
	
	
}
