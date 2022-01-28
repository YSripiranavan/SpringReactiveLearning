package com.sripiranavan.reactive.demo.service;

import com.sripiranavan.reactive.demo.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@Service
public class ProductService {

    public Flux<Product> getAll(){
        var p1 = new Product();
        p1.setName("Beer");
        var p2 = new Product();
        p2.setName("Chocolate");
        var p3 = new Product();
        Flux<Product> products = Flux.fromStream(List.of(p1,p2,p3).stream())
                .delayElements(Duration.ofSeconds(2));
        return products;
    }
}
