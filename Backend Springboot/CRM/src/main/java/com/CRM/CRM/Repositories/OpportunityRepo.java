package com.CRM.CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.CRM.Models.Opportunity;

public interface OpportunityRepo extends JpaRepository<Opportunity, Integer> {
}
