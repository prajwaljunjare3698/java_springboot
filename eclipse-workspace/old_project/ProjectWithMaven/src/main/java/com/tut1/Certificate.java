package com.tut1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Certificate {
		
	@Column(name="course_name",length=15)
	private String course;
	
	@Column(name="course_duration")
	private double duration;
			
	public Certificate(String course, double duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public Certificate() {
		super();
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "course_name "+course+" course_duration "+duration	;
	}
	
}
