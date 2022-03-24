package com.project.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.model.User;
import com.project.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
}
