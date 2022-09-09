package com.exam.service;

import java.util.Set;



import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {
	
	
	//Creating user
	
	public User createUser(User user,Set<UserRole>UserRoles) throws Exception;
	
	
	//get User
	public User getUser(String Username);
	
	
	//Delete User
	
	public void deleteUser(Long userId);

	
	
}
