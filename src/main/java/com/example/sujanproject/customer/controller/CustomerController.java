package com.example.sujanproject.customer.controller;

import com.example.sujanproject.customer.entity.CustomerEntity;
import com.example.sujanproject.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<CustomerEntity> saveCustomer(@RequestBody CustomerEntity customer) {
        CustomerEntity customer1 = customerService.saveCustomer(customer);
        return new ResponseEntity<>(customer1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CustomerEntity> updateCustomer(@RequestBody CustomerEntity customer,@PathVariable Long id ) {
        CustomerEntity customer1 = customerService.updateCustomerById(customer, id);
        return new ResponseEntity<>(customer1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCustomerById(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping("/all")
    public ResponseEntity<List<CustomerEntity>> getAllCustomer() {
        List<CustomerEntity> customerEntities = customerService.getAllCustomer();
        return new ResponseEntity<>(customerEntities, HttpStatus.OK);
    }

    @RequestMapping("/{id}")
    public ResponseEntity<CustomerEntity> getCustomerById(@PathVariable Long id) {
        CustomerEntity customer = customerService.getCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }





}
