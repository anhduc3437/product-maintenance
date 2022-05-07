package com.dduwcs.service;

import com.dduwcs.model.Product;
import org.hibernate.service.Service;
import java.util.List;

public interface ProductService extends Service {
    List<Product> getProducts();
    void save(Product product);
}
