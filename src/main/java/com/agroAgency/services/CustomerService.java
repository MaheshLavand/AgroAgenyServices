package com.agroAgency.services;

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
	
	/************************************** Medicine Code ********************************************/
	
	public FarmMedicine insertMedicine(FarmMedicine medicine) {
		return customerDao.insertMedicine(medicine);
	}
	
	public List<FarmMedicine> fetchAllMedicines() {
		return customerDao.fetchAllMedicines();
	}

	public FarmMedicine fetchMedicinePerName(String medName) {
		return customerDao.fetchMedicinePerName(medName);
	}

	public List<Customer> fetchMedicinePerCompany(String medCompany) {
		return customerDao.fetchMedicinePerCompany(medCompany);
	}

	public List<Customer> fetchMedicineAboveQuentity(String medQuantity) {
		return customerDao.fetchMedicineAboveQuentity(medQuantity);
	}

	public List<Customer> fetchMedicineBelowQuentity(String medQuantity) {
		return customerDao.fetchMedicineBelowQuentity(medQuantity);
	}

	public List<Customer> fetchMedicineAbovePrice(int medPrice) {
		return customerDao.fetchMedicineAbovePrice(medPrice);
	}

	public List<Customer> fetchMedicineBelowPrice(int medPrice) {
		return customerDao.fetchMedicineBelowPrice(medPrice);
	}

	public FarmMedicine updateMedicinePerName(String oldName, String newName) {
		FarmMedicine medicine = customerDao.fetchMedicinePerName(oldName);
		if(medicine != null) {
			medicine.setMedName(newName);
			return customerDao.updateMedicine(medicine);
		}
		return medicine;
	}

	public FarmMedicine updateMedicinePricePerName(String medName, int newPrice) {
		FarmMedicine medicine = customerDao.fetchMedicinePerName(medName);
		if(medicine != null) {
			medicine.setMedPrice(newPrice);
			customerDao.updateMedicine(medicine);
		}
		return medicine;
	}

	public FarmMedicine deleteMedicinePerName(String medName) {
		FarmMedicine medicine = customerDao.fetchMedicinePerName(medName);
		if(medicine != null) {
			customerDao.deleteMedicine(medicine.getMedId());
		}
		return medicine;
	}

	

	
	

}
