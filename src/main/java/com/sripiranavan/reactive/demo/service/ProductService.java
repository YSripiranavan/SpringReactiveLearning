package com.sripiranavan.reactive.demo.service;

import com.sripiranavan.reactive.demo.model.Product;
import com.sripiranavan.reactive.demo.repository.ProductRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Flux<Product> getProducts(){
        return productRepository.findAll().delayElements(Duration.ofSeconds(5));
    }
}
