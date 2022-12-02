package com.CRM.CRM.Repositories;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Models.Contact;
import com.CRM.CRM.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CRM.CRM.Models.Opportunity;

import java.util.List;

@Repository
public interface OpportunityRepo extends JpaRepository<Opportunity, Integer> {

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE Opportunity o SET o.Opportunity_ID =:Opportunity_ID, o.Name =:Name, o.PriorityLevel =:PriorityLevel, o.Status =:Status, o.Accounts =:Accounts, o.Contacts =:Contacts, o.user =:user WHERE o.Opportunity_ID = :Opportunity_ID", nativeQuery = true)
    void update(@Param("Opportunity_ID") Integer Opportunity_ID, @Param("Name") String Name, @Param("PriorityLevel") Integer PriorityLevel, @Param("Status") String Status, @Param("Accounts") List<Account> Accounts, @Param("Contacts") List<Contact> Contacts, @Param("user") User user);
}
