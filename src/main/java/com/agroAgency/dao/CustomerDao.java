package com.agroAgency.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agroAgency.entity.Customer;
import com.agroAgency.entity.FarmMedicine;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory factory;

	public Customer insertCustomer(Customer customer) {
		Session session = factory.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		session.close();
		return customer;

	}

	@SuppressWarnings("unchecked")
	public List<Customer> fetchAllCustomers() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Customer");
		List<Customer> custList = query.list();
		session.close();
		return custList;
	}

	public Customer fetchCustomerPerName(String custName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("custName", custName));
		Customer customer = (Customer) criteria.uniqueResult();
		session.close();
		return customer;
	}

	public List<Customer> fetchCustomerPerAddress(String custAdress) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("custAddress", custAdress));
		List<Customer> custList = criteria.list();
		session.close();
		return custList;
	}

	public Customer fetchCustomerPerPhone(String custPhone) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("custPhone", custPhone));
		Customer customer = (Customer) criteria.uniqueResult();
		session.close();
		return customer;
	}

	public Customer updateCustomerPerName(String custName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("custName", custName));
		Customer customer = (Customer) criteria.uniqueResult();
		session.close();
		return customer;
	}

	public Customer updateCustomer(Customer customer) {
		Session session = factory.openSession();
		session.saveOrUpdate(customer);
		session.beginTransaction().commit();
		session.close();
		return customer;
	}

	public Customer deleteCusromerPerName(int custId) {
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, custId);
		session.delete(customer);
		session.beginTransaction().commit();
		return customer;
	}
	
	
	/**************************************** Medicine Code	 ********************************************/

	public FarmMedicine insertMedicine(FarmMedicine medicine) {
		Session session = factory.openSession();
		session.save(medicine);
		session.beginTransaction().commit();
		session.close();
		return medicine;
	}

	public List<FarmMedicine> fetchAllMedicines() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(FarmMedicine.class);
		List<FarmMedicine> medList = criteria.list();
		session.close();
		return medList;
	}

	public FarmMedicine fetchMedicinePerName(String medName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(FarmMedicine.class);
		criteria.add(Restrictions.eq("medName", medName));
		FarmMedicine medicine = (FarmMedicine) criteria.uniqueResult();
		session.close();
		return medicine;
	}

	public List<Customer> fetchMedicinePerCompany(String medCompany) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(FarmMedicine.class);
		criteria.add(Restrictions.eq("medCompany", medCompany));
		List<Customer> medList = criteria.list();
		session.close();
		return medList;
	}

	public List<Customer> fetchMedicineAboveQuentity(String medQuantity) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(FarmMedicine.class);
		criteria.add(Restrictions.gt("medQuantity", medQuantity));
		List<Customer> medList = criteria.list();
		session.close();
		return medList;
	}

	public List<Customer> fetchMedicineBelowQuentity(String medQuantity) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(FarmMedicine.class);
		criteria.add(Restrictions.lt("medQuantity", medQuantity));
		List<Customer> medList = criteria.list();
		session.close();
		return medList;
	}

	public List<Customer> fetchMedicineAbovePrice(int medPrice) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(FarmMedicine.class);
		criteria.add(Restrictions.gt("medPrice", medPrice));
		List<Customer> medList = criteria.list();
		session.close();
		return medList;
	}

	public List<Customer> fetchMedicineBelowPrice(int medPrice) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(FarmMedicine.class);
		criteria.add(Restrictions.lt("medPrice", medPrice));
		List<Customer> medList = criteria.list();
		session.close();
		return medList;
	}

	public FarmMedicine updateMedicine(FarmMedicine medicine) {
		Session session = factory.openSession();
		session.update(medicine);
		session.beginTransaction().commit();
		return medicine;
	}

	public FarmMedicine deleteMedicine(int medId) {
		Session session = factory.openSession();
		FarmMedicine farmMedicine = session.get(FarmMedicine.class, medId);
		session.delete(farmMedicine);
		session.beginTransaction().commit();
		return farmMedicine;
	}

	
	

}
