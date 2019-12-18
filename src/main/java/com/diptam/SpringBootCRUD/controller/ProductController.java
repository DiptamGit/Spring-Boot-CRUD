package com.diptam.SpringBootCRUD.controller;

import com.diptam.SpringBootCRUD.model.Product;
import com.diptam.SpringBootCRUD.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @GetMapping
    public Product findAll(){
        Product product = new Product();
        product.setName("Diptam");
        product.setDescription("Manual");
        product.setCreatedTimeStamp(LocalDateTime.now());
        product.setUpdatedTimeStamp(LocalDateTime.now());
        return product;
    }
}
