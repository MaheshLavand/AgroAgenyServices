package com.agroAgency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.agroAgency.service.SupplierService;

@RestController
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
}
