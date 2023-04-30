package com.jspider.hibernate.onetooneBidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Java_Question_bi")
public class QuestionDTO {
	
	@Id
	@Column(name = "question_id")
	private int id;
	
	private String question;
	
	@OneToOne
	private AnswerDTO answer;
}
