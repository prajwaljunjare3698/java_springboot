package com.jspider.hibernatemanytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeDTO {

	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	@ManyToOne
	private CompanyDTO company;
}
