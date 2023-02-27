package com.cogent.infotech.entity;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "answer")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String description_answer;
	private String img_src;
	private String status;
	private String datetime;
	
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;
	
	private String approved_by;
	
	private String created_by;

}
