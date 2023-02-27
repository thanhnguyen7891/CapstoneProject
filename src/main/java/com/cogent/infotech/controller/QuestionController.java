package com.cogent.infotech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.infotech.entity.Question;
import com.cogent.infotech.service.QuestionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@PostMapping("/addquestion")
	public Question addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
	
	@PutMapping("/updatequestion")
	public Question updateQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
	
	@DeleteMapping("/deletequestionbyid/{id}")
	public Question deleteQuestionById(@PathVariable int id) {
		return questionService.deleteById(id);
		
		
	}
	
	@GetMapping("/getallquestion")
	public List<Question> getAllQuestion(){
		List<Question> questions = questionService.getAllQuestion();
		System.out.println("Question retrieved "+ questions.size());
		return questions;
	}
	
	@GetMapping("/getallquestionFalse")
	public List<Question> getAllQuestionFalse(){
		return questionService.getAllQuestionFalse();
	}
	
	@GetMapping("/getQuestionbytopic/{topic}")
	public List<Question> GetQuestionbyTopic(@PathVariable String topic) {
		List<Question> questions = questionService.get(topic);
		return questions;
	}
	
	@GetMapping("/getquestionbyid/{id}")
	public Question GetQuestionbyId(@PathVariable Integer id) {
		Question question = questionService.get(id);
		return question;
	}
	
	

}
