package com.cg.onlineinsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.cg.onlineinsurance.entity.UserRegistration;
@Repository
public interface IUserRegistrationDao extends JpaRepository<UserRegistration, Integer> {
	@Query(value = "from UserRegistration user where user.user_id=?1")
	public UserRegistration getUserById(int code);
}
