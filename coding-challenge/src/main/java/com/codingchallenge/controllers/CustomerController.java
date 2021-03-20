package com.codingchallenge.controllers;

import com.codingchallenge.entities.Customer;
import com.codingchallenge.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    private static final String origin = "http://localhost:4200";

    @CrossOrigin(origins = origin)
    @GetMapping(value = "/findAllCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    @CrossOrigin(origins = origin)
    @PostMapping(value = "/addCustomer")
    public void saveCollection(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    @CrossOrigin(origins = origin)
    @PutMapping("/editCustomer/{id}")
    public void updateTutorial(@PathVariable("id") long id, @RequestBody Customer customer) {
        customerService.updateCustomerById(id, customer);
    }

    @CrossOrigin(origins = origin)
    @GetMapping(value = "/findCustomerById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Customer> getAllCustomers(@PathVariable("id") long id) {
        return customerService.getCustomerById(id);
    }

    @CrossOrigin(origins = origin)
    @DeleteMapping(value = "/deleteCustomerById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCustomerById(@PathVariable("id") long id) {
        customerService.deleteCustomer(id);
    }

}
