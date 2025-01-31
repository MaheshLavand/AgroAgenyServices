package com.agroAgency.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.agroAgency.entity.Bill;
import com.agroAgency.entity.FarmMedicine;

@Entity
public class BillFarmMedicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "med_id")
    private FarmMedicine farmMedicine;

    private int quantity; // Quantity of this medicine in the bill
    private double pricePerUnit; // Price per unit at the time of sale

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public FarmMedicine getFarmMedicine() {
        return farmMedicine;
    }

    public void setFarmMedicine(FarmMedicine farmMedicine) {
        this.farmMedicine = farmMedicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
