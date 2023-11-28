package com.filters.api.service;
import com.filters.api.model.Product;
import com.filters.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<List<Product>> findByFilters(Integer minPrice, Integer maxPrice, Integer rating, ArrayList<String> categories) {

        List<Product> products = productRepository.findByFilters(minPrice, maxPrice, rating, categories);

        return ResponseEntity.ok(products);
        
    }
}
