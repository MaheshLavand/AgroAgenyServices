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
import org.springframework.web.bind.annotation.RestController;

import com.agroAgency.entity.Customer;
import com.agroAgency.entity.FarmMedicine;
import com.agroAgency.service.FarmMedicineService;

@RestController
@RequestMapping("/farm-medicine")
@CrossOrigin("http://localhost:4200")
public class FarmMedicineController {
	
	@Autowired
	FarmMedicineService farmMedicineService;
	
	// Insert Medicines
		@PostMapping("/insert-medicine")
		public FarmMedicine insertMedicine(@RequestBody FarmMedicine medicine) {
			return farmMedicineService.insertMedicine(medicine);
		}

		// Fetch All farm Medicines
		@GetMapping("/fetch-all-medicines")
		public List<FarmMedicine> fetchAllMedicines() {
			return farmMedicineService.fetchAllMedicines();
		}

		// Fetch Medicine Per name
		@GetMapping("/fetch-medicine-per-name/{name}")
		public FarmMedicine fetchMedicinePerName(@PathVariable("name") String medName) {
			return farmMedicineService.fetchMedicinePerName(medName);
		}

		// Fetch Medicine Per Company name
		@GetMapping("/fetch-medicine-per-company/{company}")
		public List<Customer> fetchMedicinePerCompany(@PathVariable("company") String medCompany) {
			return farmMedicineService.fetchMedicinePerCompany(medCompany);
		}

		// Fetch Medicine Per Above Quentity
		@GetMapping("/fetch-medicine-above-quentity/{quentity}")
		public List<Customer> fetchMedicineAboveQuentity(@PathVariable("quentity") String medQuantity) {
			return farmMedicineService.fetchMedicineAboveQuentity(medQuantity);
		}

		// Fetch Medicine Per Below Quentity
		@GetMapping("/fetch-medicine-below-quentity/{quentity}")
		public List<Customer> fetchMedicineBelowQuentity(@PathVariable("quentity") String medQuantity) {
			return farmMedicineService.fetchMedicineBelowQuentity(medQuantity);
		}

		// Fetch Medicine Per Above Price
		@GetMapping("/fetch-medicine-above-price/{price}")
		public List<Customer> fetchMedicineAbovePrice(@PathVariable("price") int medPrice) {
			return farmMedicineService.fetchMedicineAbovePrice(medPrice);
		}

		// Fetch Medicine Per Below Price
		@GetMapping("/fetch-medicine-below-price/{price}")
		public List<Customer> fetchMedicineBelowPrice(@PathVariable("price") int medPrice) {
			return farmMedicineService.fetchMedicineBelowPrice(medPrice);
		}

		// Update Medicine Per Name
		@PutMapping("/update-medicine-per-name/{oldName}/{newName}")
		public FarmMedicine updateMedicinePerName(@PathVariable("oldName") String oldName, @PathVariable("newName") String newName) {
			return farmMedicineService.updateMedicinePerName(oldName, newName);
		}
		
		// Update Medicine Price Per Name
		@PutMapping("/update-medicine-price-per-name/{medName}/{newPrice}")
		public FarmMedicine updateMedicinePricePerName(@PathVariable("medName") String medName, @PathVariable("newPrice") int newPrice) {
			return farmMedicineService.updateMedicinePricePerName(medName, newPrice);
		}
		
		// Delete Medicine Per Name
		@DeleteMapping("/delete-medicine-per-name/{medName}")
		public FarmMedicine deleteMedicinePerName(@PathVariable("medName") String medName) {
			return farmMedicineService.deleteMedicinePerName(medName);
		}

}
