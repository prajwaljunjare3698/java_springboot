package com.jspider.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data	
@Table(name = "student")
public class StudentDTO {
		
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)	
	private int id;
	
	private String name;
	
	private String email;
	
	private long contact;
}
