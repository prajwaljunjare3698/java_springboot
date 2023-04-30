package com.tut;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Qspider_Institute")
public class Qspider {
	@Id
	private int id;
	
	@Column(length=15,name="course_name")
	private String course;
	
	@Column(name="course_fee")
	private double fee;
	
	@Column(name="batch_time")
	private Date date;

	public Qspider() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Date getDate() {
		return date;
	}

	public void setTime(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Qspider [id=" + id + ", course=" + course + ", fee=" + fee + ", time=" + date + "]";
	}
	
	
}
