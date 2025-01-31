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
import com.agroAgency.entity.User;

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
	
	public Customer fetchCustomerPerId(int custId) {
        try (Session session = factory.openSession()) {
            return session.get(Customer.class, custId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	@SuppressWarnings("unchecked")
	public List<Customer> fetchAllCustomers() {
		Session session = factory.openSession();
		Criteria query = session.createCriteria(Customer.class);
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

	public String deleteCusromerPerName(String custName) {
		Session session = null;
		String msg = null;
		try {
			session = factory.openSession();
			Customer customer = session.get(Customer.class, custName);
			session.delete(customer);
			session.beginTransaction().commit();
			msg = "deleted";

		} catch (Exception e) {
			msg = null;
			e.printStackTrace();
		} finally {
			session.close();
		}
		return msg;
	}
	
}
