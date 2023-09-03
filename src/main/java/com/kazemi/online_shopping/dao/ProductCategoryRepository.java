package com.kazemi.online_shopping.dao;

import com.kazemi.online_shopping.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author fh.kazemi
 **/
//collectionResourceRel: Name of JSON entry - path: /product-category
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
