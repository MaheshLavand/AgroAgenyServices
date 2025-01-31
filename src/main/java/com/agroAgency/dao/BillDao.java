package com.agroAgency.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agroAgency.entity.Bill;
import com.agroAgency.entity.Customer;

@Repository
public class BillDao {

//	 @PersistenceContext
//	    private EntityManager entityManager;
//
//	    public void saveBill(Bill bill) {
//	        entityManager.persist(bill); // Custom persistence logic
//	    }
//	    
//	    public Customer findCustomerById(int customerId) {
//	        return entityManager.find(Customer.class, customerId); // Fetching the associated Customer
//	    }
	    
	    @Repository
	    public interface BillRepository extends JpaRepository<Bill, Integer> {
	    }
}
