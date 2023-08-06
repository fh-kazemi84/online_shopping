package com.kazemi.online_shopping.dao;

import com.kazemi.online_shopping.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author fh.kazemi
 **/
//collectionResourceRel: Name of JSON entry - path: /product-category
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
@Repository
@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
