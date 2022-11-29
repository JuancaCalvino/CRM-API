package com.CRM.CRM.RestController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Controllers.UserController;

public class UserRestControllerTest {

	@Autowired
	private UserController userRestController;

	// Test para cuando recibe un usuario con un get y no falla
	@Test
	void testGetUserSuccess() throws Exception {

	}

	// Test para cuando recibe un usuario con un get y falla al no encontrarlo
	@Test
	void testGetUserNotFound() throws Exception {

	}

	// Test para cuando crea un usuario y no falla
	@Test
	void testCreateUserSuccess() throws Exception {

	}

	// Test para cuando crea un usuario y falla
	@Test
	void testCreateUserError() throws Exception {

	}

	// Test para cuando hace un post de un user y no falla
	@Test
	void testReturnUserSuccess() throws Exception {

	}

	// Test para cuando hace un post de un user y falla
	@Test
	void testReturnUserError() throws Exception {

	}

}
