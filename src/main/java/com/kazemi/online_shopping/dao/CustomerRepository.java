package com.kazemi.online_shopping.dao;

import com.kazemi.online_shopping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fh.kazemi
 **/

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
