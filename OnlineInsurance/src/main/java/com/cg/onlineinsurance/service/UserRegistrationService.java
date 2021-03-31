package com.cg.onlineinsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineinsurance.dao.IUserRegistrationDao;
import com.cg.onlineinsurance.entity.UserRegistration;




@Service
public class UserRegistrationService {
	@Autowired
	IUserRegistrationDao dao;
	public void addUserRegistration(UserRegistration user) {
		dao.save(user);
	}
	public UserRegistration getUserById(int code)
	{
		return dao.getUserById(code);
	}
}
