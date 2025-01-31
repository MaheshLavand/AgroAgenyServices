//package com.agroAgency.entity;
////
////import java.util.List;
////
////import javax.persistence.CascadeType;
////import javax.persistence.Entity;
////import javax.persistence.GeneratedValue;
////import javax.persistence.GenerationType;
////import javax.persistence.Id;
////import javax.persistence.OneToMany;
////
////import org.springframework.stereotype.Component;
////
////@Component
////@Entity
////public class Customer {
////
////	@Id
////	@GeneratedValue(strategy = GenerationType.AUTO)
////	int custId;
////	String custName;
////	String custAddress;
////	String custPhone;
////
////	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
////	private List<Bill> bills;
////
////	public Customer() {
////		super();
////	}
////
////	public Customer(String custName, String custAddress, String custPhone, List<Bill> bills) {
////		super();
////		this.custName = custName;
////		this.custAddress = custAddress;
////		this.custPhone = custPhone;
////		this.bills = bills;
////	}
////
////	public int getCustId() {
////		return custId;
////	}
////
////	public void setCustId(int custId) {
////		this.custId = custId;
////	}
////
////	public String getCustName() {
////		return custName;
////	}
////
////	public void setCustName(String custName) {
////		this.custName = custName;
////	}
////
////	public String getCustAddress() {
////		return custAddress;
////	}
////
////	public void setCustAddress(String custAddress) {
////		this.custAddress = custAddress;
////	}
////
////	public String getCustPhone() {
////		return custPhone;
////	}
////
////	public void setCustPhone(String custPhone) {
////		this.custPhone = custPhone;
////	}
////
////	@Override
////	public String toString() {
////		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", custPhone="
////				+ custPhone + ", bills=" + bills + "]";
////	}
////
////}
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Customer {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int custId; // Primary Key
//
//    private String custName;
//
//    private String custAddress;
//
//    private String custPhone;
//
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Bill> bills; // One-to-Many relationship with Bill
//
//    // Getters and Setters
//    public int getCustId() {
//        return custId;
//    }
//
//    public void setCustId(int custId) {
//        this.custId = custId;
//    }
//
//    public String getCustName() {
//        return custName;
//    }
//
//    public void setCustName(String custName) {
//        this.custName = custName;
//    }
//
//    public String getCustAddress() {
//        return custAddress;
//    }
//
//    public void setCustAddress(String custAddress) {
//        this.custAddress = custAddress;
//    }
//
//    public String getCustPhone() {
//        return custPhone;
//    }
//
//    public void setCustPhone(String custPhone) {
//        this.custPhone = custPhone;
//    }
//
//    public List<Bill> getBills() {
//        return bills;
//    }
//
//    public void setBills(List<Bill> bills) {
//        this.bills = bills;
//    }
//}
//

package com.agroAgency.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId; // Primary Key
    private String custName;
    private String custAddress;
    private String custPhone;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference // Prevent infinite recursion
    private List<Bill> bills; // One-to-Many relationship with Bill

    // Default Constructor
    public Customer() {}

    // Parameterized Constructor
    public Customer(String custName, String custAddress, String custPhone, List<Bill> bills) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.custPhone = custPhone;
        this.bills = bills;
    }

    // Getters and Setters
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

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public String toString() {
        return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
                + ", custPhone=" + custPhone + "]";
    }
}
