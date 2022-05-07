package com.dduwcs.controller;

import com.dduwcs.model.Product;
import com.dduwcs.service.ProductServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path= "productMaint1")
public class ProductController {
    @Autowired
    private ProductServiceImplement productServiceImplement;
    @GetMapping(value = "")
    public String home() {
        return "index";
    }

    @GetMapping(value = "displayProducts")
    public String viewProducts(Model model) {
        List<Product> products = this.productServiceImplement.getProducts();
        model.addAttribute("products", products);
        return "products";
    }
}
