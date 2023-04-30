package com.jspider.hibernate.onetooneBidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Java_answer_bi")
public class AnswerDTO {
	@Id
	@Column(name = "Answer_id")
	private int id;
	
	private String answer;
	
	@OneToOne
	private QuestionDTO question;
}
