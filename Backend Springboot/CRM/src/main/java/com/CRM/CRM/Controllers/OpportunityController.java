package com.CRM.CRM.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.CRM.CRM.Models.Opportunity;
import com.CRM.CRM.Services.OpportunityService;

public class OpportunityController {

	@Autowired
	OpportunityService opportunityService;

	// Devuelve todas las oportunidades
	@CrossOrigin()
	@GetMapping("/opportunities")
	public ResponseEntity<List<Opportunity>> returnsOpportunities() {

		List<Opportunity> opportunitiesList = opportunityService.retrieveOpportunities();

		if (opportunitiesList.size() != 0)
			return new ResponseEntity<>(opportunitiesList, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
