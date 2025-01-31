package com.agroAgency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroAgency.dao.BillDao;

@Service
public class BillService {
	
	@Autowired
	BillDao billDao;
	
//	@Autowired 
//	private BillRepository billRepository;
//	
//	 @Transactional
//	    public void insertBill(Bill bill, int customerId) {
//	        // Fetch the associated Customer
//	        Customer customer = billDao.findCustomerById(customerId);
//
//	        if (customer == null) {
//	            throw new RuntimeException("Customer with ID " + customerId + " not found.");
//	        }
//
//	        // Associate the Bill with the Customer
//	        bill.setCustomer(customer);
//
//	        // Save the Bill
//	        billDao.saveBill(bill);
//	    }
//	 
//	 
//
//	    public Bill saveBill(Bill bill) {
//	        return billRepository.save(bill);
//	    }

}
