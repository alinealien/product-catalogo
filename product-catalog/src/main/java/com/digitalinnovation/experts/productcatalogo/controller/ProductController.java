package com.digitalinnovation.experts.productcatalogo.controller;

import com.digitalinnovation.experts.productcatalog.model.Product;
import com.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Interger id){
        return productRepository.findById(id);
    }
}
