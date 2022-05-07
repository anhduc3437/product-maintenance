package com.dduwcs.service;

import com.dduwcs.model.Product;
import com.dduwcs.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplement implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplement(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {

        return this.productRepository.findAll();
    }
    
    public Product find(String code) {
    	return this.productRepository.findByCode(code);
    }
    
    public void save(Product product) {
    	this.productRepository.save(product);
    }
    
//    public void update(Product product) {
//    	this.productRepository.update(product);
//    }
}
