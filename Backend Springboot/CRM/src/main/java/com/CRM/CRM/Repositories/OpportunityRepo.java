package com.CRM.CRM.Repositories;

import com.CRM.CRM.Models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CRM.CRM.Models.Opportunity;

@Repository
@Transactional
public interface OpportunityRepo extends JpaRepository<Opportunity, Integer> {

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Opportunity o SET o.name = :name, o.priorityLevel = :priorityLevel, o.status = :status, o.user = :user WHERE o.opportunityID = :opportunityID")
    void update(@Param("opportunityID") Integer opportunityID, @Param("name") String name, @Param("priorityLevel") Integer priorityLevel, @Param("status") String status, @Param("user") User user);
}
