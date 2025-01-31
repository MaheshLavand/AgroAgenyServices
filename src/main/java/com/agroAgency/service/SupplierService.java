package com.agroAgency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroAgency.dao.SupplierDao;

@Service
public class SupplierService {

	@Autowired
	SupplierDao daoSupplierDao;
}
