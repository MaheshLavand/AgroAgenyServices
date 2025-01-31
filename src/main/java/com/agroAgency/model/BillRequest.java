package com.agroAgency.model;
public class BillRequest {

    private int numberOfMedicine;
    private String billDate;
    private String time;
    private double totalPrice;
    private int custId; // ID of the associated customer

    // Getters and Setters
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

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }
}
