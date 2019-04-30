package com.asm.springexample.service;

import com.asm.springexample.model.Customer;
import com.asm.springexample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public Customer getCustomerById(String customerId) {
        return customerRepository.getCustomerById(customerId);
    }

    public List<Customer> getCustomerList() {
        return customerRepository.getCustomerList();
    }

    public String addCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

}
