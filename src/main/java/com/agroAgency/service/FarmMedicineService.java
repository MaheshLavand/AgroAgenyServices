package com.agroAgency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroAgency.dao.FarmMedicineDao;
import com.agroAgency.entity.Customer;
import com.agroAgency.entity.FarmMedicine;

@Service
public class FarmMedicineService {

	@Autowired
	FarmMedicineDao farmMedicineDao;
	public FarmMedicine insertMedicine(FarmMedicine medicine) {
		return farmMedicineDao.insertMedicine(medicine);
	}
	
	public List<FarmMedicine> fetchAllMedicines() {
		return farmMedicineDao.fetchAllMedicines();
	}

	public FarmMedicine fetchMedicinePerName(String medName) {
		return farmMedicineDao.fetchMedicinePerName(medName);
	}

	public List<Customer> fetchMedicinePerCompany(String medCompany) {
		return farmMedicineDao.fetchMedicinePerCompany(medCompany);
	}

	public List<Customer> fetchMedicineAboveQuentity(String medQuantity) {
		return farmMedicineDao.fetchMedicineAboveQuentity(medQuantity);
	}

	public List<Customer> fetchMedicineBelowQuentity(String medQuantity) {
		return farmMedicineDao.fetchMedicineBelowQuentity(medQuantity);
	}

	public List<Customer> fetchMedicineAbovePrice(int medPrice) {
		return farmMedicineDao.fetchMedicineAbovePrice(medPrice);
	}

	public List<Customer> fetchMedicineBelowPrice(int medPrice) {
		return farmMedicineDao.fetchMedicineBelowPrice(medPrice);
	}

	public FarmMedicine updateMedicinePerName(String oldName, String newName) {
		FarmMedicine medicine = farmMedicineDao.fetchMedicinePerName(oldName);
		if(medicine != null) {
			medicine.setMedName(newName);
			return farmMedicineDao.updateMedicine(medicine);
		}
		return medicine;
	}

	public FarmMedicine updateMedicinePricePerName(String medName, int newPrice) {
		FarmMedicine medicine = farmMedicineDao.fetchMedicinePerName(medName);
		if(medicine != null) {
			medicine.setMedPrice(newPrice);
			farmMedicineDao.updateMedicine(medicine);
		}
		return medicine;
	}

	public FarmMedicine deleteMedicinePerName(String medName) {
		FarmMedicine medicine = farmMedicineDao.fetchMedicinePerName(medName);
		if(medicine != null) {
			farmMedicineDao.deleteMedicine(medicine.getMedId());
		}
		return medicine;
	}
}
