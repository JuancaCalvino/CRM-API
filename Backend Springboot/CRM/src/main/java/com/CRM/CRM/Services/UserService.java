package com.CRM.CRM.Services;

import com.CRM.CRM.Repositories.UserRepo;

public class UserService {
	
	UserRepo userRepository;
	
	public UserService(UserRepo userRepository)
	{
		this.userRepository = userRepository;

	}
}
