package com.example.product.service;

import com.example.product.dto.ProductUpdate;
import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> get(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAll(Product product) {
        return productRepository.findAll();
    }

    public Product update(ProductUpdate productUpdate, Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setPrice(productUpdate.getPrice());
            return productRepository.save(product);
        }
        return null;
    }

    public String delete(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            productRepository.deleteById(id);
            return "The Product has been deleted successfully!";
        }
        return "Product with id " + id + " not found";
    }
}
