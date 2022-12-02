package com.CRM.CRM.Controllers;

import java.util.List;

import com.CRM.CRM.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.CRM.Models.Opportunity;
import com.CRM.CRM.Services.OpportunityService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/opportunity")
public class OpportunityController {

	@Autowired
	OpportunityService opportunityService;

	// Crea una oportunidad con el usuario dado
	@CrossOrigin()
	@PostMapping("/createOpportunity")
	public ResponseEntity<Opportunity> createOpportunity(@Valid @RequestBody Opportunity opportunity, User user) {

		opportunity.setUser(user);
		Opportunity oportunidad = opportunityService.saveOpportunity(opportunity);

		if (oportunidad != null)
			return new ResponseEntity<>(oportunidad, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Devuelve todas las oportunidades
	@CrossOrigin()
	@GetMapping("/getOpportunities")
	public ResponseEntity<List<Opportunity>> returnsOpportunities() {

		List<Opportunity> opportunitiesList = opportunityService.retrieveOpportunities();

		if (opportunitiesList.size() != 0)
			return new ResponseEntity<>(opportunitiesList, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
