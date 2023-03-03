package com.kazemi.online_shopping.dao;

import com.kazemi.online_shopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fh.kazemi
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
}
