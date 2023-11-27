package com.filters.api.repository;

import com.filters.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByFilters(Integer minPrice, Integer maxPrice, Integer rating, ArrayList<String> categories);
}
