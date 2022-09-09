package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
		
		
	}


	@Autowired
	private UserService userService;

	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code...");
		
//		User user =new User();
//		
//		//Set the User
//		user.setFirstName("Sayantan");
//		user.setLastName("Datta");
//		user.setUsername("sd50");
//		user.setPassword("abc");
//		user.setEmail("sdatta9771@gmail.com");
//		user.setPhone("7029238427");
//		
//		
//		//Set the Role
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		
//		Set<UserRole>userRoleSet=new HashSet<>();
//		
//		UserRole userRole=new UserRole();
//		
//		
//		//In User Role we Create User
//		userRole.setUser(user);
//		//In User Role we Create Role
//		
//		
//		userRole.setRole(role1);
//		//We add UserRole which we create
//		userRoleSet.add(userRole);
//	
//		
//		//Create the User
//		User user1=this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
//		
//		
//		
//		
		}

}
