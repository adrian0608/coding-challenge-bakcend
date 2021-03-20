package com.codingchallenge.services.impl;

import com.codingchallenge.entities.Customer;
import com.codingchallenge.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingchallenge.services.CustomerService;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> getCustomerById(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void updateCustomerById(long id, Customer customerUpdated) {
        customerUpdated.setId(id);
        customerRepository.save(customerUpdated);
    }
}
