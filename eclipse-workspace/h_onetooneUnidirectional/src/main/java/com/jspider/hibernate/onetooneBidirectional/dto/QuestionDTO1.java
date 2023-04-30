package com.jspider.hibernate.onetooneBidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Java_question_uni")
public class QuestionDTO1 {
	
	@Id
	@Column(name = "question_id")
	private int id;
	
	private String question;
	
	@OneToOne
	private AnswerDTO1 answer;
}
