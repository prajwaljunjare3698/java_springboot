package com.jspider.h_manytomanyBidirectional.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "bi_Mobile")
public class MobileDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "mobile_id")
	private int id;
	
	@Column(name = "mobile_company")
	private String company;
	
	@Column(name = "mobile_model")
	private String modelNo;
	
	@ManyToMany(mappedBy = "mobile")
	List<UserDTO> user;
	

}
