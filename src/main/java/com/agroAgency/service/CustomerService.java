package com.agroAgency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroAgency.dao.CustomerDao;
import com.agroAgency.entity.Customer;
import com.agroAgency.entity.FarmMedicine;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public Customer insertCustomer(Customer customer) {
		return customerDao.insertCustomer(customer);
	}

	public List<Customer> fetchAllCustomers() {
		return customerDao.fetchAllCustomers();
	}

	public Customer fetchCustomerPerName(String custName) {
		return customerDao.fetchCustomerPerName(custName);
	}

	public List<Customer> fetchCustomerPerAddress(String custAdress) {
		return customerDao.fetchCustomerPerAddress(custAdress);
	}

	public Customer fetchCustomerPerPhone(String custPhone) {
		return customerDao.fetchCustomerPerPhone(custPhone);
	}

	public Customer updateCustomerPerName(String oldName, String newName) {
		Customer customer = customerDao.fetchCustomerPerName(oldName);
		if(customer != null) {
			customer.setCustName(newName);
			return customerDao.updateCustomer(customer);
		}
		return customer;
	}
	
	public Customer updateCustomerPhonePerName(String custName, String newPhone) {
		Customer customer = customerDao.fetchCustomerPerName(custName);
		if(customer != null) {
			customer.setCustPhone(newPhone);
			return customerDao.updateCustomer(customer);
		}
		return customer;
	}
	
	public Customer deleteCusromerPerName(String custName) {
		Customer customer = customerDao.fetchCustomerPerName(custName);
		if(customer != null) {
			return customerDao.deleteCusromerPerName(customer.getCustId());
		}
		return customer;
	}
	
}
