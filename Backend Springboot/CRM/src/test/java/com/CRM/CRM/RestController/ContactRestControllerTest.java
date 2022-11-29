package com.CRM.CRM.RestController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Controllers.ContactController;

public class ContactRestControllerTest {

	@Autowired
	private ContactController contactRestController;

	// Test para cuando recibe un Contacto con un get y no falla
	@Test
	void testGetContactSuccess() throws Exception {

	}

	// Test para cuando recibe un Contacto con un get y falla al no encontrarlo
	@Test
	void testGetContactNotFound() throws Exception {

	}

	// Test para cuando crea un Contacto y no falla
	@Test
	void testCreateContactSuccess() throws Exception {

	}

	// Test para cuando crea un Contacto y falla
	@Test
	void testCreateContactError() throws Exception {

	}

	// Test para cuando hace un post de un Contacto y no falla
	@Test
	void testReturnContactSuccess() throws Exception {

	}

	// Test para cuando hace un post de un Contacto y falla
	@Test
	void testReturnContactError() throws Exception {

	}
}
