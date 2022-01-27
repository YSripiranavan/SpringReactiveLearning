package com.sripiranavan.reactive.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(value = "products")
public class Product {
    @Id
    private int id;
    private String name;
}
