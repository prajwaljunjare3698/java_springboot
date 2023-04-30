package com.jspider.hibernate.onetooneBidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Java_answer_uni")
public class AnswerDTO1 {
	@Id
	@Column(name = "answer_id")
	private int id;
	
	private String answer;
	
}
