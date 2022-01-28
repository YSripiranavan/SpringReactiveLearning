package com.sripiranavan.reactive.demo1.service;

import com.sripiranavan.reactive.demo1.model.Product;
import com.sripiranavan.reactive.demo1.proxy.ProductProxy;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductService {
    private final ProductProxy productProxy;

    public ProductService(ProductProxy productProxy) {
        this.productProxy = productProxy;
    }


    public Flux<Product> getAll(){
        return productProxy.getAll();
    }
}
