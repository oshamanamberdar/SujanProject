package com.example.sujanproject.customer.service;

import com.example.sujanproject.customer.entity.CustomerEntity;
import com.example.sujanproject.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    // Method for adding a customer

    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    // Updating a customer
    public CustomerEntity updateCustomerById(CustomerEntity customer, Long id) {
        return customerRepository.save(customer);
    }

    // deleting a customer
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    // Get  all customer
    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.findAll();
    }

    // Get Customer by there ID
    public CustomerEntity getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

}
