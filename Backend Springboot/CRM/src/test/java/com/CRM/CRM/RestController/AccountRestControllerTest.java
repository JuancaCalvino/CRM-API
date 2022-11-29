package com.CRM.CRM.RestController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Controllers.AccountController;

public class AccountRestControllerTest {

	@Autowired
	private AccountController accountRestController;

	// Test para cuando recibe una Cuenta con un get y no falla
	@Test
	void testGetContactSuccess() throws Exception {
		
	}

	// Test para cuando recibe una Cuenta con un get y falla al no encontrarlo
	@Test
	void testGetContactNotFound() throws Exception {

	}

	// Test para cuando crea una Cuenta y no falla
	@Test
	void testCreateContactSuccess() throws Exception {

	}

	// Test para cuando crea una Cuenta y falla
	@Test
	void testCreateContactError() throws Exception {

	}

	// Test para cuando hace un post de una Cuenta y no falla
	@Test
	void testReturnContactSuccess() throws Exception {

	}

	// Test para cuando hace un post de una Cuenta y falla
	@Test
	void testReturnContactError() throws Exception {

	}

	// Test para cuando actualiza una cuenta y no falla
	@Test
	void testUpdateContactSuccess() throws Exception {

	}

	// Test para cuando actualiza una cuenta y falla
	@Test
	void testUpdateContactError() throws Exception {

	}
}
