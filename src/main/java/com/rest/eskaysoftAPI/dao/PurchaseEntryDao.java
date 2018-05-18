package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.PurchaseEntry;

@Repository("PurchaseEntryDao")
@Transactional
public interface PurchaseEntryDao extends JpaRepository<PurchaseEntry, Long> {

}