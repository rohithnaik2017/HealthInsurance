package com.cg.onlineinsurance.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineinsurance.entity.UserRegistration;
import com.cg.onlineinsurance.service.UserRegistrationService;
import com.cg.onlineinsurance.utils.UserNotFoundException;




@RestController
@RequestMapping("/User")
public class UserRegistrationController {
	@Autowired
	UserRegistrationService service;
	@PostMapping("/Registration")
	public ResponseEntity<String> addUserRegistration(@Valid @RequestBody UserRegistration user,Errors error){
		
		if(error.hasFieldErrors("email"))
		{
			return new ResponseEntity<String>("Email is invalid or empty",HttpStatus.OK);
		}
		else {
		service.addUserRegistration(user); 
		//UserRegistration userreg=
		return new ResponseEntity<String>("User Registered",HttpStatus.OK);
		}
	}
	@GetMapping("/login")
	public ResponseEntity<UserRegistration> getUsertById(@RequestBody int code){
		UserRegistration user=service.getUserById(code);
		if(user==null) {
			throw new UserNotFoundException();
		}
		return new ResponseEntity<UserRegistration>(user,HttpStatus.OK);
	}
}
