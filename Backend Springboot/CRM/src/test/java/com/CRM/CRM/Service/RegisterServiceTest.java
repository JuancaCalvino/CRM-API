package com.CRM.CRM.Service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.CRM.CRM.Models.User;
import com.CRM.CRM.Repositories.UserRepo;
import com.CRM.CRM.Services.UserService;

@SpringBootTest
public class RegisterServiceTest {
	
	@Autowired
	UserService userService = new UserService();
	
	@Autowired
	UserRepo userRepository;
	
	@Test
	void NameFieldShouldNotBeEmpty() {
		
		User user = new User();
		user.setName("");
		user.setEmail("testingmail@mail.com");
		user.setPassword("contrasena");
		user.setPhone(666666666);
		user.setAddress("C/solera");
		userService.saveUser(user);
	}
	
	@Test
	void userNameShouldBeMailFormat() {

		User user = new User();
		user.setName("user");
		user.setEmail("testingmail");
		user.setPassword("contrasena");
		user.setPhone(666666666);
		user.setAddress("C/solera");
		userService.saveUser(user);
	}

	@Test
	void passwordShouldNotBeEmpty() {
		
		User user = new User();
		user.setName("user");
		user.setEmail("testingmail");
		user.setPassword("");
		user.setPhone(666666666);
		user.setAddress("C/solera");
		userService.saveUser(user);
	}
	
	@Test
	void ShouldLoginSuccesful() {
		
		User user = new User();
		user.setEmail("solera@solera.com");
		user.setPassword("contraseña");
		List<User> userList= userService.loginUser(user);
		assertThat(userList.size() != 0);
	}
	
	@Test
	void addressShouldNotBeEmpty() {
		
		User user = new User();
		user.setName("user");
		user.setEmail("testingmail@testing.com");
		user.setPassword("password");
		user.setPhone(666666666);
		user.setAddress("");
		userService.saveUser(user);
	}

	@Test
	void userNameFieldShouldNotBeEmpty() {
		
		User user = new User();
		user.setEmail("");
		user.setPassword("contraseña");
		List<User> userList= userService.loginUser(user);
		assertThat(userList.size() == 0);
	}
	
	@Test
	void phoneFieldShouldNotBeEmpty() {
		
		
	}
	
	@Test
	void phoneFieldShouldBePhone() {
		
	}
}
