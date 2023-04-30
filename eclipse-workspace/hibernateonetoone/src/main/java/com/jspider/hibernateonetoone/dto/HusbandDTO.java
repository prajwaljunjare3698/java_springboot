package com.jspider.hibernateonetoone.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class HusbandDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private int age;
	private long contact;
	
//	@OneToOne(cascade = CascadeType.ALL)
	@OneToOne
	private WifeDTO wife;	
}
