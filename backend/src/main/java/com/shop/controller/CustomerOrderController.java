package com.shop.controller;

import com.shop.entity.CustomerOrder;
import com.shop.service.CustomerOrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class CustomerOrderController {

    private final CustomerOrderService service;

    public CustomerOrderController(CustomerOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomerOrder> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CustomerOrder getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/search")
    public List<CustomerOrder> search(@RequestParam String keyword) {
        return service.search(keyword);
    }

    @PostMapping
    public ResponseEntity<CustomerOrder> create(@Valid @RequestBody CustomerOrder customerOrder) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(customerOrder));
    }

    @PutMapping("/{id}")
    public CustomerOrder update(@PathVariable Long id, @Valid @RequestBody CustomerOrder customerOrder) {
        return service.update(id, customerOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
