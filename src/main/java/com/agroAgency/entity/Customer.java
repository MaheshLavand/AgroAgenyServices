package com.agroAgency.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int custId;
	String custName;
	String custAddress;
	String custPhone;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	List<FarmMedicine> medList;

	public Customer() {
		super();
	}

	public Customer(String custName, String custAddress, String custPhone, List<FarmMedicine> medList) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
		this.custPhone = custPhone;
		this.medList = medList;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public List<FarmMedicine> getMedList() {
		return medList;
	}

	public void setMedList(List<FarmMedicine> medList) {
		this.medList = medList;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", custPhone="
				+ custPhone + ", medList=" + medList + "]";
	}

}
