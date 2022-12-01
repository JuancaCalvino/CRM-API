package com.CRM.CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRM.CRM.Models.Opportunity;

@Repository
public interface OpportunityRepo extends JpaRepository<Opportunity, Integer> {
}
