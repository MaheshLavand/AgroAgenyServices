package com.agroAgency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agroAgency.entity.Customer;
import com.agroAgency.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:4200")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	// Insert Customer
	@PostMapping("/insert-customer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return customerService.insertCustomer(customer);
	}

	// Fetch All Customers
	@GetMapping("fetch-all-customers")
	public List<Customer> fetchAllCustomers() {
		return customerService.fetchAllCustomers();
	}

	// Fetch Customer Per name
	@GetMapping("fetch-customer-per-name/{name}")
	public Customer fetchCustomerPerName(@PathVariable("name") String custName) {
		return customerService.fetchCustomerPerName(custName);
	}

	// Fetch Customer Per Address
	@GetMapping("fetch-customer-per-address/{address}")
	public List<Customer> fetchCustomerPerAddress(@PathVariable("address") String custAdress) {
		return customerService.fetchCustomerPerAddress(custAdress);
	}

	// Fetch Customer Per Phone
	@GetMapping("fetch-customer-per-phone/{phone}")
	public Customer fetchCustomerPerPhone(@PathVariable("phone") String custPhone) {
		return customerService.fetchCustomerPerPhone(custPhone);
	}

	// Update Customer Per name
	@PutMapping("update-customer-per-name/{oldName}/{newName}")
	public Customer updateCustomerPerName(@PathVariable("oldName") String oldName,
			@PathVariable("newName") String newName) {
		return customerService.updateCustomerPerName(oldName, newName);
	}

	// Update Customer Phone per Name
	@PutMapping("update-customer-phone/{custName}/{newPhone}")
	public Customer updateCustomerPhonePerName(@PathVariable("custName") String custName,
			@PathVariable("newPhone") String newPhone) {
		return customerService.updateCustomerPhonePerName(custName, newPhone);
	}

	// Delete Customers Per Name
	@DeleteMapping("delete-cusromer-per-name")
	public String deleteCusromerPerName(@RequestParam String custName) {
		return customerService.deleteCusromerPerName(custName);
	}

}
