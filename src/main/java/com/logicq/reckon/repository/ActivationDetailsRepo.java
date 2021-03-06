package com.logicq.reckon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.logicq.reckon.model.ActivationDetails;

@Repository
@Transactional(readOnly = true)
public interface ActivationDetailsRepo extends JpaRepository<ActivationDetails, String>{

	
}
