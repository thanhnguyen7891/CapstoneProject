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

import com.cogent.infotech.entity.Answer;
import com.cogent.infotech.entity.Chat;
import com.cogent.infotech.entity.Question;
import com.cogent.infotech.entity.User;
import com.cogent.infotech.service.AnswerService;
import com.cogent.infotech.service.ChatService;
import com.cogent.infotech.service.QuestionService;
import com.cogent.infotech.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	AnswerService answerService;
	
	@Autowired
	ChatService chatService;
	
	
//	@GetMapping("/")
//	public String Home() {
//		return "Welcome to the Capstone Project";
//	}
//	
//	@PostMapping("/user/adduser")
//	public User addUser(@RequestBody User user) {
//		return userService.update(user);
//	}
//	
//	@PutMapping("/user/updateuser")
//	public User getByName(@RequestBody User user) {
//		return userService.update(user);
//	}
//	
//	@PostMapping("/user/getLogin")
//	public boolean GetLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) { 
//		return userService.verify(username, password);
//	}
//	
//	@GetMapping("/user/getbyalluserType")
//	public void GetUserbyName() {
//		
//	}
//	
//	@GetMapping("/user/getuserbyId/{id}")
//	public User getUserById(@PathVariable("id") Integer id) {
//		User u = userService.getUserById(id);
//		return u;
//	}
//	
//	
//	@GetMapping("/user/getallusers")
//	public List<User> getAllUser() {
//		List<User> users = userService.getAllUser();
//		System.out.println("User retrieved "+ users.size());
//		return users;
//	}
//	
//	@GetMapping("/user/getallcustomers")
//	public void getallCustomer() {
//		
//	}
//	
//	@GetMapping("/user/DeleteById")
//	public void deleteById() {
//		
//	}
//	
//	@PostMapping("/question/addquestion")
//	public Question addQuestion(@RequestBody Question question) {
//		return questionService.addQuestion(question);
//	}
//	
//	@PutMapping("/question/updatequestion")
//	public Question updateQuestion(@RequestBody Question question) {
//		return questionService.addQuestion(question);
//	}
//	
//	@DeleteMapping("/question/deletequestionbyid/{id}")
//	public String deleteQuestionById(@RequestParam(value = "id") Integer id) {
//		Optional<Question> q = Optional.ofNullable(questionService.get(id));
//		questionService.delete(q.get());
//		return "Question ID "+ id+ " deleted successfully!!";
//		
//	}
//	
//	@GetMapping("/question/getallquestion")
//	public List<Question> getAllQuestion(){
//		List<Question> questions = questionService.getAllQuestion();
//		System.out.println("Question retrieved "+ questions.size());
//		return questions;
//	}
//	
//	@GetMapping("/question/getallquestionFalse")
//	public void GetAllQuestionFalse() {
//		
//	}
//	
//	@GetMapping("/question/getQuestionbytopic/{topic}")
//	public List<Question> GetQuestionbyTopic(@RequestParam(value = "topic") String topic) {
//		List<Question> questions = questionService.get(topic);
//		return questions;
//	}
//	
//	@GetMapping("/question/getquestionbyid/{id}")
//	public Question GetQuestionbyId(@RequestParam(value = "id") Integer id) {
//		Question question = questionService.get(id);
//		return question;
//	}
//	
//	@PostMapping("/answer/addanswer")
//	public Answer addAnswer(@RequestBody Answer answer) {
//		return answerService.update(answer);
//	}
//	
//	@GetMapping("/answer/getanswerbyid/{id}")
//	public Answer getById(@PathVariable("id") Integer id) {
//		Optional<Answer> a = answerService.get(id);
//		return a.get();
//	}
//	
//	@PutMapping("/answer/updateanswer")
//	public Answer updateAnswer(@RequestBody Answer answer) {
//		return answerService.update(answer);
//	}
//	
//	@DeleteMapping("/answer/deleteanswerbyid/{id}")
//	public String deleteAnswerById(@RequestParam(value = "id") Integer id) {
//		Optional<Answer> b = answerService.get(id);
//		answerService.delete(b.get());
//		return "Answer ID "+ id+ " deleted successfully!";
//	}
//	
//	@GetMapping("/answer/getAnswersbyQuestionID")
//	public void GetAnswerbyQuestionId() {
//		
//	}
//	
//	@GetMapping("/chat/addmsg")
//	public void Addmsg() {
//		
//	}
//	
//	@DeleteMapping("/chat/deletechatbyid/{id}")
//	public void deleteChatbyid(@RequestParam (value = "id") Integer id) {
//		chatService.delete(id);
//	}
//	
//	
//	@GetMapping("/chat/getallmsg")
//	public List<Chat> getAllMsg(){
//		return chatService.getAllMsg();
//	}
	

}
