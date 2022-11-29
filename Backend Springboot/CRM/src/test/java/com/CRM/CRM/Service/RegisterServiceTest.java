package com.CRM.CRM.Service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Models.User;
import com.CRM.CRM.Services.UserService;

public class RegisterServiceTest {
	
	@Autowired
    private UserService userService;
	
	@Test
	void userNameFieldShouldNotBeEmpty() {
		
		User user1 = new User();
		user1.setName(null);
		user1.setEmail("solera@solera.com");
		user1.setAddress("C/Solera");
		user1.setPhone(666666666);
		user1.setPassword("contrasenaprueba");
		
		userService.saveUser(user1);
		
		Collection<User> users = this.userService.findUserById(user1.getUser_ID());
		int found = users.size();
		assertThat(users.size()).isEqualTo(found+1);
	}
	
	@Test
	void userNameShouldBeMailFormat() {

	}

	@Test
	void passwordShouldNotBeEmpty() {

	}
	
	@Test
	void passwordShouldBeTheSame() {
		
	}
	
	@Test
	void addressShouldNotBeEmpty() {
		
	}

	@Test
	void nameFieldShouldNotBeEmpty() {
		
	}
	
	@Test
	void phoneFieldShouldNotBeEmpty() {
		
	}
	
	@Test
	void phoneFieldShouldBePhone() {
		
	}
	
	@Test
	void 
}
