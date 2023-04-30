package com.jspider.h_manytomanyUnidirectional.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Student_uni")
public class StudentDTO{

	@Id
	@Column(name = "student_id")
	private int id;
	
	@Column(name = "student_name")
	private String name;
	
	@ManyToMany
	private List<TeacherDTO> teachers;
}
