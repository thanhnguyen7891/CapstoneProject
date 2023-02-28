package com.cogent.infotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.infotech.entity.Chat;
import com.cogent.infotech.service.ChatService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("chat")
public class ChatController {

	@Autowired
	ChatService chatService;
	
	@GetMapping("getallmsg")
	public List<Chat> getAllMsg(){
		return chatService.getAllMsg();
	}
	
	@DeleteMapping("deletechatbyid/{id}")
	public void deleteChatbyid(@RequestParam (value = "id") Integer id) {
		chatService.delete(id);
	}
	
	@PostMapping("/addmsg") 
	public Chat Addmsg(@RequestBody Chat chat) {
		return chatService.create(chat);
	}
	
	@GetMapping("/chat/getmessagesbyuser/{sender}/{receiver}")
	public List<Chat> getmessagesbyuser(@PathVariable String sender, @PathVariable String receiver){
		return chatService.getBetween(sender, receiver);
	}
	
}
