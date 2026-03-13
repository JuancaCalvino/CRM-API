package com.CRM.CRM.Service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Models.User;
import com.CRM.CRM.Services.UserService;

public class LoginServiceTest {

	@Autowired
	UserService userService;
	
	@Test
	void ShouldLoginSuccesful() {
		
		User user = new User();
		user.setEmail("solera@solere.com");
		user.setPassword("contrasena");
		List<User> userList = userService.loginUser(user);
		assertThat(userList).isNotEmpty();
	}
	
	@Test
	void EmailFieldShouldNotBeEmptyAtLogin() {
		
		User user = new User();
		user.setEmail("");
		user.setPassword("contraseña");
		List<User> userList = userService.loginUser(user);
		assertThat(userList).isEmpty();
	}
	
	@Test
	void PasswordFieldShouldNotBeEmptyAtLogin() {
		
		User user = new User();
		user.setEmail("solera@solere.com");
		user.setPassword("");
		List<User> userList = userService.loginUser(user);
		assertThat(userList).isEmpty();
	}
}
