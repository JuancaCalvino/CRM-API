package com.CRM.CRM.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.CRM.Models.Opportunity;
import com.CRM.CRM.Repositories.OpportunityRepo;

import jakarta.validation.Valid;

@Service
public class OpportunityService {

	@Autowired
	OpportunityRepo opportunityRepository;

	// Devuelve todas las Oportunidades de la base de datos
	public List<Opportunity> retrieveOpportunities() {

		return opportunityRepository.findAll();
	}

	// Guarda una oportunidad en la base de datos
	public Opportunity saveOpportunity(@Valid Opportunity opportunity) {
		
		return opportunityRepository.save(opportunity);
	}
}
