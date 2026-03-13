package com.CRM.CRM.Repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CRM.CRM.Models.Contact;

import java.sql.Date;

@Repository
@Transactional
public interface ContactRepo extends JpaRepository<Contact, Integer> {

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Contact c SET c.method = :method, c.date = :date WHERE c.contactID = :contactID")
    void update(@Param("contactID") Integer contactID, @Param("method") String method, @Param("date") Date date);
}
