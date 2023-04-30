package com.jspider.springcorexml.manytoone.bean;

import lombok.Data;

@Data
public class VoterBean {
	
	private int id;
	
	private String name;
	
	private CandidateBean favCandidate;
	
}
