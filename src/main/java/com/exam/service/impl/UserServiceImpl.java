package com.exam.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private RoleRepository rolerepository;
	
	
	
	
	//Create User

	@Override
	public User createUser(User user, Set<UserRole> UserRoles) throws Exception   {
		
		
		User local=this.userRepository.findByUsername(user.getUsername());
		
		if (local != null) {
			System.out.println("User Already Present there ! !");
			
			throw new Exception("User Already Present there ! !");
			
			
		}
		else {
			
			for (UserRole ur : UserRoles) {
				
				rolerepository.save(ur.getRole());
				
			}
			user.getUserRoles().addAll(UserRoles);
			local =this.userRepository.save(user);
		}

		return local;
	}
//get username
	@Override
	public User getUser(String Username) {

		return this.userRepository.findByUsername(Username);
	}
	
	
	
//Delete username
	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);
		
	}

	
}
