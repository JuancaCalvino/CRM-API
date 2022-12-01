package com.CRM.CRM.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.CRM.CRM.Repositories.OpportunityRepo;

import com.CRM.CRM.Services.OpportunityService;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class CreatingOpportunity {

	@Autowired
	OpportunityService opportunityService = new OpportunityService();
	
	@Autowired
	OpportunityRepo opportunityRepository;
	
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
	void ShouldCreateOpportunitySuccesful() {
		
//		Opportunity opportunity = new Opportunity();
//		opportunity.setName("Prueba oportunidad");
//		opportunity.setPriorityLevel(1);
//		opportunity.setStatus("contrasena");
//		opportunity.setUser({"solera@solera.com"});
//		opportunity.setAddress("C/solera");
//		
//		userService.saveUser(user);
//		
//		Set<ConstraintViolation<User>> violations = validator.validate(user);
//		assertTrue(violations.isEmpty());
	}
	
	@Test
	void opportunityNameFieldShouldNotBeEmpty() {
		
		
	}
	
	@Test
	void priorityLevelShouldBeNumber() {
		
	}
	
	@Test
	void priorityShouldBeBetweenRange() {
		
	}
	
	@Test
	void firstTimePriorityStatusShouldBeOpen() {
		
	}
	
	@Test
	void priorityShouldNotBeDuplicate() {
		
	}
	
	@Test
	void accountFieldShouldNotBeEmpty() {

	}
}
