package com.dduwcs.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dduwcs.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
	List<Product> findAll();
	Product findByCode(String code);
	Product save(Product product);
}
