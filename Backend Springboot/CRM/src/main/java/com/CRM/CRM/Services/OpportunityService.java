package com.CRM.CRM.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Models.Opportunity;
import com.CRM.CRM.Repositories.OpportunityRepo;

public class OpportunityService {

	@Autowired
	OpportunityRepo opportunityRepository;

	// Devuelve todas las Oportunidades de la base de datos
	public List<Opportunity> retrieveOpportunities() {

		return opportunityRepository.findAll();
	}
}
