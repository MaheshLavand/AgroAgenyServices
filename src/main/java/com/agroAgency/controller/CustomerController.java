package com.agroAgency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agroAgency.entity.Customer;
import com.agroAgency.entity.FarmMedicine;
import com.agroAgency.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	// Insert Customer
	@PostMapping("insertCustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return customerService.insertCustomer(customer);
	}

	// Fetch All Customers
	@GetMapping("fetchAllCustomers")
	public List<Customer> fetchAllCustomers() {
		return customerService.fetchAllCustomers();
	}

	// Fetch Customer Per name
	@GetMapping("fetchCustomerPerName/{name}")
	public Customer fetchCustomerPerName(@PathVariable("name") String custName) {
		return customerService.fetchCustomerPerName(custName);
	}

	// Fetch Customer Per Address
	@GetMapping("fetchCustomerPerAddress/{address}")
	public List<Customer> fetchCustomerPerAddress(@PathVariable("address") String custAdress) {
		return customerService.fetchCustomerPerAddress(custAdress);
	}

	// Fetch Customer Per Phone
	@GetMapping("fetchCustomerPerPhone/{phone}")
	public Customer fetchCustomerPerPhone(@PathVariable("phone") String custPhone) {
		return customerService.fetchCustomerPerPhone(custPhone);
	}

	// Update Customer Per name
	@PutMapping("updateCustomerPerName/{oldName}/{newName}")
	public Customer updateCustomerPerName(@PathVariable("oldName") String oldName,
			@PathVariable("newName") String newName) {
		return customerService.updateCustomerPerName(oldName, newName);
	}

	// Update Customer Phone per Name
	@PutMapping("updateCustomerPhone/{custName}/{newPhone}")
	public Customer updateCustomerPhonePerName(@PathVariable("custName") String custName,
			@PathVariable("newPhone") String newPhone) {
		return customerService.updateCustomerPhonePerName(custName, newPhone);
	}

	// Delete Customers Per Name
	@DeleteMapping("deleteCusromerPerName/{name}")
	public Customer deleteCusromerPerName(@PathVariable("name") String custName) {
		return customerService.deleteCusromerPerName(custName);
	}

	/****************************************
	 * Medicine Code
	 ********************************************/

	// Insert Medicines
	@PostMapping("insertMedicine")
	public FarmMedicine insertMedicine(@RequestBody FarmMedicine medicine) {
		return customerService.insertMedicine(medicine);
	}

	// Fetch All farm Medicines
	@GetMapping("fetchAllMedicines")
	public List<FarmMedicine> fetchAllMedicines() {
		return customerService.fetchAllMedicines();
	}

	// Fetch Medicine Per name
	@GetMapping("fetchMedicinePerName/{name}")
	public FarmMedicine fetchMedicinePerName(@PathVariable("name") String medName) {
		return customerService.fetchMedicinePerName(medName);
	}

	// Fetch Medicine Per Company name
	@GetMapping("fetchMedicinePerCompany/{company}")
	public List<Customer> fetchMedicinePerCompany(@PathVariable("company") String medCompany) {
		return customerService.fetchMedicinePerCompany(medCompany);
	}

	// Fetch Medicine Per Above Quentity
	@GetMapping("fetchMedicineAboveQuentity/{quentity}")
	public List<Customer> fetchMedicineAboveQuentity(@PathVariable("quentity") String medQuantity) {
		return customerService.fetchMedicineAboveQuentity(medQuantity);
	}

	// Fetch Medicine Per Below Quentity
	@GetMapping("fetchMedicineBelowQuentity/{quentity}")
	public List<Customer> fetchMedicineBelowQuentity(@PathVariable("quentity") String medQuantity) {
		return customerService.fetchMedicineBelowQuentity(medQuantity);
	}

	// Fetch Medicine Per Above Price
	@GetMapping("fetchMedicineAbovePrice/{price}")
	public List<Customer> fetchMedicineAbovePrice(@PathVariable("price") int medPrice) {
		return customerService.fetchMedicineAbovePrice(medPrice);
	}

	// Fetch Medicine Per Below Price
	@GetMapping("fetchMedicineBelowPrice/{price}")
	public List<Customer> fetchMedicineBelowPrice(@PathVariable("price") int medPrice) {
		return customerService.fetchMedicineBelowPrice(medPrice);
	}

	// Update Medicine Per Name
	@PutMapping("updateMedicinePerName/{oldName}/{newName}")
	public FarmMedicine updateMedicinePerName(@PathVariable("oldName") String oldName, @PathVariable("newName") String newName) {
		return customerService.updateMedicinePerName(oldName, newName);
	}
	
	// Update Medicine Price Per Name
	@PutMapping("updateMedicinePricePerName/{medName}/{newPrice}")
	public FarmMedicine updateMedicinePricePerName(@PathVariable("medName") String medName, @PathVariable("newPrice") int newPrice) {
		return customerService.updateMedicinePricePerName(medName, newPrice);
	}
	
	// Delete Medicine Per Name
	@DeleteMapping("deleteMedicinePerName/{medName}")
	public FarmMedicine deleteMedicinePerName(@PathVariable("medName") String medName) {
		return customerService.deleteMedicinePerName(medName);
	}
}
