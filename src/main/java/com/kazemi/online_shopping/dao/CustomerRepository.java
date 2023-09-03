package com.kazemi.online_shopping.dao;

import com.kazemi.online_shopping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fh.kazemi
 **/

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String theEmail);
}
