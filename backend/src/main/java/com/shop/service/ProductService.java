package com.shop.service;

import com.shop.entity.Product;
import com.shop.exception.ResourceNotFoundException;
import com.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }

    public Product create(Product product) {
        product.setId(null);
        return repository.save(product);
    }

    public Product update(Long id, Product updated) {
        Product existing = getById(id);
        existing.setName(updated.getName());
        existing.setDescription(updated.getDescription());
        existing.setCategory(updated.getCategory());
        existing.setPrice(updated.getPrice());
        existing.setStock(updated.getStock());
        existing.setImageUrl(updated.getImageUrl());
        return repository.save(existing);
    }

    public void delete(Long id) {
        Product existing = getById(id);
        repository.delete(existing);
    }

    public List<Product> search(String keyword) {
        return repository.findByCategoryContainingIgnoreCase(keyword);
    }
}
