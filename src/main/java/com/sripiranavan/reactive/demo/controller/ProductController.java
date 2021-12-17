package com.sripiranavan.reactive.demo.controller;

import com.sripiranavan.reactive.demo.model.Product;
import com.sripiranavan.reactive.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping(value = "/product",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Product> getProducts(){
        return productService.getProducts();
    }
}
