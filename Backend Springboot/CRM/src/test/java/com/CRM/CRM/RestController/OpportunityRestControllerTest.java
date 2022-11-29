package com.CRM.CRM.RestController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Controllers.OpportunityController;
import com.CRM.CRM.Controllers.UserController;

public class OpportunityRestControllerTest {

	@Autowired
	private OpportunityController opportunityRestController;

	// Test para cuando recibe una Opportunity con un get y no falla
	@Test
	void testGetOpportunitySuccess() throws Exception {

	}

	// Test para cuando recibe una Opportunity con un get y falla al no encontrarlo
	@Test
	void testGetOpportunityNotFound() throws Exception {

	}

	// Test para cuando crea una Opportunity y no falla
	@Test
	void testCreateOpportunitySuccess() throws Exception {

	}

	// Test para cuando crea una Opportunity y falla
	@Test
	void testCreateOpportunityError() throws Exception {

	}

	// Test para cuando hace un post de una Opportunity y no falla
	@Test
	void testReturnOpportunitySuccess() throws Exception {

	}

	// Test para cuando hace un post de una Opportunity y falla
	@Test
	void testReturnOpportunityError() throws Exception {

	}

	// Test para cuando actualiza una oportunidad y no falla
	@Test
	void testUpdateOpportunitySuccess() throws Exception {

	}

	// Test para cuando actualiza una oportunidad y falla
	@Test
	void testUpdateOpportunityError() throws Exception {

	}
}
