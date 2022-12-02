package com.CRM.CRM.Services;

import java.util.List;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Models.Contact;
import com.CRM.CRM.Models.User;
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

    // Borra la aoportunidad dada
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

        Integer Opportunity_ID = opportunity.getOpportunityID();
        String Name = opportunity.getName();
        Integer PriorityLevel = opportunity.getPriorityLevel();
        String Status = opportunity.getStatus();
        List<Account> Accounts = opportunity.getAccounts();
        List<Contact> Contacts = opportunity.getContacts();
        User user = opportunity.getUser();

        try {
            opportunityRepository.update(Opportunity_ID, Name, PriorityLevel, Status, Accounts, Contacts, user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
