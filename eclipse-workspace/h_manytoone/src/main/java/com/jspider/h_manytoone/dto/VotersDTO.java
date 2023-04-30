package com.jspider.h_manytoone.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Election_Voters")
public class VotersDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "voters_id")
	private int id;
	
	@Column(name = "voter_name")
	private String name;
	
	@ManyToOne
	private CandidateDTO candidate;
}
