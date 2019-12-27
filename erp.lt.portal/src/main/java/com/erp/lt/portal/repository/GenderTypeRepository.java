package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.GenderType;

@Repository
public interface GenderTypeRepository extends JpaRepository<GenderType, Integer> {

}
