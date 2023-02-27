package com.cogent.infotech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.infotech.entity.Question;
import com.cogent.infotech.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;


	public Question get(Integer id) {
		Optional<Question> q = questionRepository.findById(id);
		Question question = q.get();
		return question;
	}
	public List<Question> getAllQuestion() {
		return questionRepository.findAll();
	}

	public Question addQuestion(Question question) {
		return questionRepository.save(question);
	}

	public List<Question> getAllQuestionFalse() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Question> get(String topic) {
		List<Question> questions = questionRepository.findByTopic(topic);
		return questions;
	}

	public Question deleteById(int id) {
		Question question = get(id);
		questionRepository.deleteById(id);
		return question;
	}

}
