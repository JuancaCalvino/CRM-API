package com.CRM.CRM.Services;

import com.CRM.CRM.Repositories.OpportunityRepo;

public class OpportunityService {

	OpportunityRepo opportunityRepository;

	public OpportunityService(OpportunityRepo opportunityRepository)
	{
		this.opportunityRepository = opportunityRepository;
		
	}
}
