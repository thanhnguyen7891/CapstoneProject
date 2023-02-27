package com.cogent.infotech;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.infotech.entity.Answer;
import com.cogent.infotech.entity.Question;
import com.cogent.infotech.entity.User;
import com.cogent.infotech.repository.AnswerRepository;
import com.cogent.infotech.repository.QuestionRepository;
import com.cogent.infotech.repository.UserRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CapstoneProjectApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(CapstoneProjectApplication.class, args);
	}

}
