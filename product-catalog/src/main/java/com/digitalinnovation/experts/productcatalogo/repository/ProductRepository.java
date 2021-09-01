package com.digitalinnovation.experts.productcatalogo.repository;

import com.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

