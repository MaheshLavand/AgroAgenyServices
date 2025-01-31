package com.agroAgency.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agroAgency.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
    // Add custom query methods if needed, for example:
    // List<Bill> findByCustomerName(String customerName);
}

