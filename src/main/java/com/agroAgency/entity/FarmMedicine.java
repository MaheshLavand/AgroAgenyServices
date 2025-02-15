package com.agroAgency.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.agroAgency.model.BillFarmMedicine;

@Component
@Entity
public class FarmMedicine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int medId;
	String medName;
	String medCompany;
	String unit;
	String medQuantity;
	String mfgDate;
	String expDate;
	int medPrice;

	@OneToMany(mappedBy = "farmMedicine", cascade = CascadeType.ALL)
	private List<BillFarmMedicine> billFarmMedicines = new ArrayList<>();

	public FarmMedicine() {
		super();
	}

	public FarmMedicine(int medId, String medName, String medCompany, String unit, String medQuantity, String mfgDate,
			String expDate, int medPrice) {
		super();
		this.medId = medId;
		this.medName = medName;
		this.medCompany = medCompany;
		this.unit = unit;
		this.medQuantity = medQuantity;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
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

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<BillFarmMedicine> getBillFarmMedicines() {
		return billFarmMedicines;
	}

	public void setBillFarmMedicines(List<BillFarmMedicine> billFarmMedicines) {
		this.billFarmMedicines = billFarmMedicines;
	}

	@Override
	public String toString() {
		return "FarmMedicine [medId=" + medId + ", medName=" + medName + ", medCompany=" + medCompany + ", unit=" + unit
				+ ", medQuantity=" + medQuantity + ", mfgDate=" + mfgDate + ", expDate=" + expDate + ", medPrice="
				+ medPrice + "]";
	}

}
