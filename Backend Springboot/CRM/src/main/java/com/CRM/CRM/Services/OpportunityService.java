package com.CRM.CRM.Services;

import java.util.List;

import com.CRM.CRM.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.CRM.Models.Opportunity;
import com.CRM.CRM.Repositories.OpportunityRepo;

@Service
public class OpportunityService {

    @Autowired
    OpportunityRepo opportunityRepository;

    // Devuelve todas las Oportunidades de la base de datos
    public List<Opportunity> retrieveOpportunities() {

        return opportunityRepository.findAll();
    }

    // Guarda una oportunidad en la base de datos
    public Opportunity saveOpportunity(Opportunity opportunity) {

        return opportunityRepository.save(opportunity);
    }

    // Borra la oportunidad dada
    public Boolean deleteOpportunity(Opportunity opportunity) {

        try {
            opportunityRepository.deleteById(opportunity.getOpportunityID());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Actualiza la oportunidad dada en la base de datos
    public Boolean updateOpportunity(Opportunity opportunity) {

        Integer opportunityId = opportunity.getOpportunityID();
        String name = opportunity.getName();
        Integer priorityLevel = opportunity.getPriorityLevel();
        String status = opportunity.getStatus();
        User user = opportunity.getUser();

        try {
            opportunityRepository.update(opportunityId, name, priorityLevel, status, user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
