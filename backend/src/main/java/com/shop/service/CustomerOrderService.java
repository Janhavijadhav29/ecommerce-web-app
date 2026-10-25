package com.shop.service;

import com.shop.entity.CustomerOrder;
import com.shop.exception.ResourceNotFoundException;
import com.shop.repository.CustomerOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderService {

    private final CustomerOrderRepository repository;

    public CustomerOrderService(CustomerOrderRepository repository) {
        this.repository = repository;
    }

    public List<CustomerOrder> getAll() {
        return repository.findAll();
    }

    public CustomerOrder getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CustomerOrder not found with id: " + id));
    }

    public CustomerOrder create(CustomerOrder customerOrder) {
        customerOrder.setId(null);
        return repository.save(customerOrder);
    }

    public CustomerOrder update(Long id, CustomerOrder updated) {
        CustomerOrder existing = getById(id);
        existing.setCustomerName(updated.getCustomerName());
        existing.setEmail(updated.getEmail());
        existing.setProductName(updated.getProductName());
        existing.setQuantity(updated.getQuantity());
        existing.setTotalAmount(updated.getTotalAmount());
        existing.setStatus(updated.getStatus());
        existing.setOrderDate(updated.getOrderDate());
        return repository.save(existing);
    }

    public void delete(Long id) {
        CustomerOrder existing = getById(id);
        repository.delete(existing);
    }

    public List<CustomerOrder> search(String keyword) {
        return repository.findByCustomerNameContainingIgnoreCase(keyword);
    }
}
