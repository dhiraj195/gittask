package com.trigent.service;

import com.trigent.entity.User;
import com.trigent.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
