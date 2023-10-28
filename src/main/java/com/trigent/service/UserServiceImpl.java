package com.trigent.service;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trigent.entity.Role;
import com.trigent.entity.User;
import com.trigent.repository.UserRepository;
import com.trigent.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	


	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), 
				registrationDto.getUserName(), registrationDto.getPassWord(), Arrays.asList(new Role("Role User")));
	
		return userRepository.save(user);
	}
	//@Override
//	public User save(UserRegistrationDto registrationDto) {
//	    // Assuming you have a method in UserRepository to find a role by name
//	    Role userRole = userRepository.findRoleByName("ROLE_USER"); // Example method to find role by name
//
//	    if (userRole == null) {
//	        // Handle the situation when the role doesn't exist, perhaps throw an exception or create default role
//	    }
//
//	    User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), 
//	                        registrationDto.getUserName(), registrationDto.getPassWord(), Collections.singletonList(userRole));
//
//	    return userRepository.save(user);
//	}

}


