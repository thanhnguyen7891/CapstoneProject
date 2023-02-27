package com.cogent.infotech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cogent.infotech.entity.User;
import com.cogent.infotech.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User update(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}
	public User deleteById(int id) {
		User user=getUserById(id);
	 userRepository.deleteById(id);
	return user;	
	}

	public boolean verify(String username, String password) {
		Optional<User> user = userRepository.findByUsernameAndPassword(username, password);
		return user.isPresent();
	}

	


}
