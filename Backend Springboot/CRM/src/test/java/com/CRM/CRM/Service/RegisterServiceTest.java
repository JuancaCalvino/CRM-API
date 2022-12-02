package com.CRM.CRM.Service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.CRM.CRM.Models.User;
import com.CRM.CRM.Repositories.UserRepo;
import com.CRM.CRM.Services.UserService;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

@SpringBootTest
public class RegisterServiceTest {
	
	@Autowired
	UserService userService = new UserService();
	
	@Autowired
	UserRepo userRepository;
	
	private static ValidatorFactory validatorFactory;
	private static Validator validator;
	
	@BeforeClass
	public static void createValidator() {
	    validatorFactory = Validation.buildDefaultValidatorFactory();
	    validator = validatorFactory.getValidator();
	}
	
	@AfterClass
	public static void close() {
	    validatorFactory.close();
	}
	
	@Test
	void ShouldRegisterSuccessful() {
		
		User user = new User();
		user.setName("Prueba");
		user.setEmail("testingmail@mail.com");
		user.setPassword("contrasena");
		user.setPhone(666666666);
		user.setAddress("C/solera");
		
		userService.saveUser(user);
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	void NameFieldShouldNotBeEmpty() {
		
		User user = new User();
		user.setName("");
		user.setEmail("testingmail@mail.com");
		user.setPassword("contrasena");
		user.setPhone(666666666);
		user.setAddress("C/solera");
		
		userService.saveUser(user);
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		assertFalse(violations.isEmpty());
	}
	
	@Test
	void EmailShouldBeMailFormat() {

		User user = new User();
		user.setName("user");
		user.setEmail("testingmail");
		user.setPassword("contrasena");
		user.setPhone(666666666);
		user.setAddress("C/solera");
		
		userService.saveUser(user);
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		assertFalse(violations.isEmpty());
	}

	@Test
	void PasswordShouldNotBeEmpty() {
		
		User user = new User();
		user.setName("user");
		user.setEmail("testingmail");
		user.setPassword("");
		user.setPhone(666666666);
		user.setAddress("C/solera");
		
		userService.saveUser(user);
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		assertFalse(violations.isEmpty());
	}
	
	@Test
	void AddressShouldNotBeEmpty() {
		
		User user = new User();
		user.setName("user");
		user.setEmail("testingmail@testing.com");
		user.setPassword("password");
		user.setPhone(666666666);
		user.setAddress("");
		userService.saveUser(user);
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		assertFalse(violations.isEmpty());
	}
	
	@Test
	void PhoneFieldShouldNotBeEmpty() {
		
		User user = new User();
		user.setName("user");
		user.setEmail("testingmail@testing.com");
		user.setPassword("password");
		user.setPhone(null);
		user.setAddress("street");
		userService.saveUser(user);
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		assertFalse(violations.isEmpty());
	}
}
