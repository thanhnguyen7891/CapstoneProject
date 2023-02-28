package com.cogent.infotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.entity.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer> {

	List<Chat> findByFromUserAndToUser(String sender, String receiver);

}
