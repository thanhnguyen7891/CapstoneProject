package com.cogent.infotech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsernameAndPassword(String username, String password);

	User findByUsername(String username);

	

}
