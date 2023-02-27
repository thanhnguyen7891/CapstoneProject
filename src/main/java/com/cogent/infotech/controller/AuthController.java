package com.cogent.infotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.infotech.entity.User;
import com.cogent.infotech.util.JwtUtil;

@RestController
@CrossOrigin
public class AuthController {
	 @Autowired
	    private JwtUtil jwtUtil;
	    @Autowired
	    private AuthenticationManager authenticationManager;

	    @GetMapping("/")
	    public String welcome() {
	        return "Welcome to Great learning !!";
	    }

	    @PostMapping("/authenticate")
	    public String generateToken(@RequestBody User authRequest) throws Exception {
	        try {
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
	            );
	        } catch (Exception ex) {
	            throw new Exception("inavalid username/password");
	        }
	        return jwtUtil.generateToken(authRequest.getUsername());
	    }
}
