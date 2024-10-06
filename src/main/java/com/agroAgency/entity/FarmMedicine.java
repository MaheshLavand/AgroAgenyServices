package com.agroAgency.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class FarmMedicine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int medId;
	String medName;
	String medCompany;
	String medQuantity;
	int medPrice;

	public FarmMedicine() {
		super();
	}

	public FarmMedicine(String medName, String medCompany, String medQuantity, int medPrice) {
		super();
		this.medName = medName;
		this.medCompany = medCompany;
		this.medQuantity = medQuantity;
		this.medPrice = medPrice;
	}

	public int getMedId() {
		return medId;
	}

	public void setMedId(int medId) {
		this.medId = medId;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getMedCompany() {
		return medCompany;
	}

	public void setMedCompany(String medCompany) {
		this.medCompany = medCompany;
	}

	public String getMedQuantity() {
		return medQuantity;
	}

	public void setMedQuantity(String medQuantity) {
		this.medQuantity = medQuantity;
	}

	public int getMedPrice() {
		return medPrice;
	}

	public void setMedPrice(int medPrice) {
		this.medPrice = medPrice;
	}

	@Override
	public String toString() {
		return "FarmMedicine [medId=" + medId + ", medName=" + medName + ", medCompany=" + medCompany + ", medQuantity="
				+ medQuantity + ", medPrice=" + medPrice + "]";
	}

}
