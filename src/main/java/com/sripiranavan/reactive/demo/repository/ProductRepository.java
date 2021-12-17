package com.sripiranavan.reactive.demo.repository;

import com.sripiranavan.reactive.demo.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product,Integer> {
}
