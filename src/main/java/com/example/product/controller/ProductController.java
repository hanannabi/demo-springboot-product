package com.example.product.controller;

import com.example.product.dto.ProductUpdate;
import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> get(@PathVariable Long id) {
        return productService.get(id);
    }

    @GetMapping
    public List<Product> getAll(Product product) {
        return productService.getAll(product);
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody ProductUpdate productUpdate, @PathVariable Long id) {
        return productService.update(productUpdate, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable Long id) {
        return productService.delete(id);
    }
}
