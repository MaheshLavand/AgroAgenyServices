//package com.agroAgency.entity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
////
////import javax.persistence.Entity;
////import javax.persistence.GeneratedValue;
////import javax.persistence.GenerationType;
////import javax.persistence.Id;
////import javax.persistence.JoinColumn;
////import javax.persistence.ManyToOne;
////
////@Entity
////public class Bill {
////	@Id
////	@GeneratedValue(strategy = GenerationType.AUTO)
////	int billId;
////	int number_of_medicine;
////	String billDate;
////	String time;
////	double totalPrice;
////
////	@ManyToOne
////	@JoinColumn(name = "customer_id", nullable = false)
////	private Customer customer;
////	int id = customer.getCustId();
////
////	public Bill() {
////		super();
////	}
////
////	public Bill(int billId,int number_of_medicine, String billDate, String time, double totalPrice, Customer customer) {
////		super();
////		this.billId = billId;
////		this.number_of_medicine = number_of_medicine;
////		this.billDate = billDate;
////		this.time = time;
////		this.totalPrice = totalPrice;
////		this.customer = customer;
////	}
////
////	public int getBillId() {
////		return billId;
////	}
////
////	public void setBillId(int billId) {
////		this.billId = billId;
////	}
////
////	public int getNumber_of_medicine() {
////		return number_of_medicine;
////	}
////
////	public void setNumber_of_medicine(int number_of_medicine) {
////		this.number_of_medicine = number_of_medicine;
////	}
////
////	public String getBillDate() {
////		return billDate;
////	}
////
////	public void setBillDate(String billDate) {
////		this.billDate = billDate;
////	}
////
////	public String getTime() {
////		return time;
////	}
////
////	public void setTime(String time) {
////		this.time = time;
////	}
////
////	public double getTotalPrice() {
////		return totalPrice;
////	}
////
////	public void setTotalPrice(double totalPrice) {
////		this.totalPrice = totalPrice;
////	}
////
////	public Customer getCustomer() {
////		return customer;
////	}
////
////	public void setCustomer(Customer customer) {
////		this.customer = customer;
////	}
////
////	@Override
////	public String toString() {
////		return "Bill [billId=" + billId + ", number_of_medicine=" + number_of_medicine + ", billDate=" + billDate
////				+ ", time=" + time + ", totalPrice=" + totalPrice + ", customer=" + customer + "]";
////	}
////
////}
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//
//import com.agroAgency.model.BillFarmMedicine;
//
//@Entity
//public class Bill {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int billId; // Primary Key
//
//	private int numberOfMedicine;
//
//	private String billDate;
//
//	private String time;
//
//	private double totalPrice;
//
//	@ManyToOne
//	@JoinColumn(name = "cust_id", nullable = false) // Foreign Key
//	private Customer customer; // Many-to-One relationship with Customer
//
//	//ABC
//	@OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
//    private List<BillFarmMedicine> billFarmMedicines = new ArrayList<>();
//
//
//	// Getters and Setters
//	public int getBillId() {
//		return billId;
//	}
//
//	public void setBillId(int billId) {
//		this.billId = billId;
//	}
//
//	public int getNumberOfMedicine() {
//		return numberOfMedicine;
//	}
//
//	public void setNumberOfMedicine(int numberOfMedicine) {
//		this.numberOfMedicine = numberOfMedicine;
//	}
//
//	public String getBillDate() {
//		return billDate;
//	}
//
//	public void setBillDate(String billDate) {
//		this.billDate = billDate;
//	}
//
//	public String getTime() {
//		return time;
//	}
//
//	public void setTime(String time) {
//		this.time = time;
//	}
//
//	public double getTotalPrice() {
//		return totalPrice;
//	}
//
//	public void setTotalPrice(double totalPrice) {
//		this.totalPrice = totalPrice;
//	}
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//	public List<BillFarmMedicine> getBillMedicines() {
//		return billFarmMedicines;
//	}
//
//	public void setBillMedicines(List<BillFarmMedicine> billFarmMedicines) {
//		this.billFarmMedicines = billFarmMedicines;
//		
//	}
//
//}
package com.agroAgency.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.agroAgency.model.BillFarmMedicine;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId; // Primary Key
    private int numberOfMedicine;
    private String billDate;
    private String time;
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "cust_id", nullable = false) // Foreign Key to Customer
    @JsonBackReference // Prevent infinite recursion
    private Customer customer;

    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
    private List<BillFarmMedicine> billFarmMedicines = new ArrayList<>(); // One-to-Many with BillFarmMedicine

    // Default Constructor
    public Bill() {}

    // Parameterized Constructor
    public Bill(int numberOfMedicine, String billDate, String time, double totalPrice, Customer customer) {
        this.numberOfMedicine = numberOfMedicine;
        this.billDate = billDate;
        this.time = time;
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    // Getters and Setters
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getNumberOfMedicine() {
        return numberOfMedicine;
    }

    public void setNumberOfMedicine(int numberOfMedicine) {
        this.numberOfMedicine = numberOfMedicine;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<BillFarmMedicine> getBillFarmMedicines() {
        return billFarmMedicines;
    }

    public void setBillFarmMedicines(List<BillFarmMedicine> billFarmMedicines) {
        this.billFarmMedicines = billFarmMedicines;
    }

    @Override
    public String toString() {
        return "Bill [billId=" + billId + ", numberOfMedicine=" + numberOfMedicine + ", billDate=" + billDate
                + ", time=" + time + ", totalPrice=" + totalPrice + "]";
    }
}

