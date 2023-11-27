package com.filters.api.service;

import ch.qos.logback.core.util.StatusPrinter;
import com.filters.api.config.ModelMapper;
import com.filters.api.mapper.ProductMapper;
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

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ModelMapper modalMapper;

    public ResponseEntity<List<Product>> findByFilters(Integer minPrice, Integer maxPrice, Integer rating, ArrayList<String> categories) {

        List<Product> products = productRepository.findByFilters(minPrice, maxPrice, rating, categories);

        return ResponseEntity.ok(products);
        
    }

    private List<Product> convertEntitiesToDTOs(List<Product> products) {
        return productMapper.parseListObjects(products, Product.class, modalMapper);
    }


}
