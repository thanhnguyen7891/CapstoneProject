package com.cogent.infotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.entity.Answer;
import com.cogent.infotech.entity.Question;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	List<Answer> findByQuestion(Question question);
	

}
