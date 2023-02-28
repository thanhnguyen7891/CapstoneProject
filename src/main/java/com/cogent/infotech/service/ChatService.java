package com.cogent.infotech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.infotech.entity.Chat;
import com.cogent.infotech.repository.ChatRepository;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
public class ChatService {
	
	@Autowired
	ChatRepository chatRepository;

	public List<Chat> getAllMsg() {
		// TODO Auto-generated method stub
		return chatRepository.findAll();
	}

	public void delete(Integer id) {
		Optional<Chat> c = chatRepository.findById(id);
		Chat chat = c.get();
		chatRepository.delete(chat);
	}

	public Chat create(Chat chat) {
		return chatRepository.save(chat);
	}

	public List<Chat> getBetween(String sender, String receiver) {
		// TODO Auto-generated method stub
		return (List<Chat>) chatRepository.findByFromUserAndToUser(sender, receiver);
	}

}
