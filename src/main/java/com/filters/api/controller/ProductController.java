package com.filters.api.controller;

import com.filters.api.model.Product;
import com.filters.api.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/findByFilters")
public class ProductController {

    @Autowired
    private Service service;

    @GetMapping
    public ResponseEntity<List<Product>> findByFilters(
            @RequestParam(required = false) Integer minPrice,
            @RequestParam(required = false) Integer maxPrice,
            @RequestParam(required = false) Integer rating,
            @RequestParam(required = false) ArrayList<String> categories
    ) {

        return ResponseEntity.ok(service.findByFilters(minPrice, maxPrice, rating, categories)).getBody();
    }

}
