package com.logicq.reckon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.logicq.reckon.model.LinkedRNotifyDetails;
import com.logicq.reckon.model.LinkedService;

@Transactional
public interface LinkedRnotifyDetailsRepository extends JpaRepository<LinkedRNotifyDetails, Long> {
	List<LinkedRNotifyDetails> findByNotifiers(Long reckonId);
}
