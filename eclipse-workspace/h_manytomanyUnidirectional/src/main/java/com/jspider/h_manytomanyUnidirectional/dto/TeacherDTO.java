package com.jspider.h_manytomanyUnidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Teacher_uni")
@Data
public class TeacherDTO {
	
	@Id
	@Column(name = "teacher_id")
	private int id;
	
	@Column(name = "teacher_name")
	private String name;
	
	
} 
