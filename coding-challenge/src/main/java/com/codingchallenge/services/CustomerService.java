package com.codingchallenge.services;

import com.codingchallenge.entities.Customer;


import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public void saveCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public void deleteCustomer(long id);
    public Optional<Customer> getCustomerById(long id);
    public void updateCustomerById(long id, Customer customerUpdated);
}
