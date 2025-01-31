package com.agroAgency.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int supId;
	String firstName;
	String lastName;
	String companyName;
	String mobileNumber;
	String email;
	String address;

	public Supplier() {
		super();
	}

	public Supplier(String firstName, String lastName, String companyName, String mobileNumber, String email,
			String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
	}

	public int getSupId() {
		return supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Supplier [supId=" + supId + ", firstName=" + firstName + ", lastName=" + lastName + ", companyName="
				+ companyName + ", mobileNumber=" + mobileNumber + ", email=" + email + ", address=" + address + "]";
	}

}
