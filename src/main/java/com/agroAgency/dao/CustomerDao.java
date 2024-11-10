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
	
}
