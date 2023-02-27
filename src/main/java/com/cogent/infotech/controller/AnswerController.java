package com.cogent.infotech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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

import com.cogent.infotech.entity.Answer;
import com.cogent.infotech.service.AnswerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("answer")
public class AnswerController {

	@Autowired
	AnswerService answerService;
	
	@GetMapping("/getallanswers")
	public List<Answer> getAllUser(){
		List<Answer> answers = answerService.getAllUser();
		return answers;
	}
	
	@GetMapping("/getAllAnswerFalse") //need to ask this
	public List<Answer> getAllFalseAnswers(){
		return answerService.getAllFalseAnswer();
	}
	
	@PostMapping("/addanswer")
	public Answer addAnswer(@RequestBody Answer answer) {
		return answerService.update(answer);
	}
	
	@GetMapping("/getanswerbyid/{id}")
	public Answer getById(@PathVariable("id") Integer id) {
		Answer answer = answerService.getAnswerById(id);
		return answer;
	}
	
	@PutMapping("/updateanswer")
	public Answer updateAnswer(@RequestBody Answer answer) {
		return answerService.update(answer);
	}
	
	@DeleteMapping("/deleteanswerbyid/{id}")
	public Answer deleteAnswerById(@PathVariable Integer id) {
		return answerService.deleteById(id);
	}
	
	@GetMapping("/getAnswersbyQuestionID")
	public List<Answer> getAnswerByQuestionId(@RequestParam(value = "id") Integer id) {
		List<Answer> answers = answerService.getQuestion(id);
		return answers;
	}
	
}
