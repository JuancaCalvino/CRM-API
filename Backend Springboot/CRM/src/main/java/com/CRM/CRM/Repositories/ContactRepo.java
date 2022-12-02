package com.CRM.CRM.Repositories;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Models.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.CRM.Models.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

public interface ContactRepo extends JpaRepository<Contact, Integer>{
    @Query(value = "UPDATE Contact c SET c.method =:method, c.date =:date, c.Account_id =:Account_id, c.Opportunity_id =:Opportunity_id WHERE c.contactID =:contactID", nativeQuery = true)

    void update(@Param("contactID") Integer contact_id, @Param("method") String method, @Param("date") Date date, @Param("Account_id") Account account, @Param("Opportunity_id") Opportunity opportunity);
}
