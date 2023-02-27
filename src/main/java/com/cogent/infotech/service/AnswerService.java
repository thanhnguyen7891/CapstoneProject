package com.cogent.infotech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.infotech.entity.Answer;
import com.cogent.infotech.entity.Question;
import com.cogent.infotech.repository.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	AnswerRepository answerRepository;
	
	@Autowired
	QuestionService questionService;

	public List<Answer> getAllUser() {
		return answerRepository.findAll();
	}

	public Answer update(Answer answer) {
		return answerRepository.save(answer);
	}


	public List<Answer> getAllFalseAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Answer> getQuestion(Integer id) {
		
		Question question = questionService.get(id);
		List<Answer> answers = answerRepository.findByQuestion(question);
		return answers;
	}

	public Answer deleteById(Integer id) {
		Answer answer = getAnswerById(id);
		answerRepository.deleteById(id);
		return answer;
	}

	public Answer getAnswerById(Integer id) {
		return answerRepository.findById(id).orElse(null);
	}

}
