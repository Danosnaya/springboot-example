package com.asm.springexample.service;

import com.asm.springexample.model.Customer;
import com.asm.springexample.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    ExampleRepository exampleRepository;

    public Customer getSomeData(String customerId, String name ){
        return exampleRepository.addToList( new Customer(customerId,"Hi",name));
    }

    public List<Customer> getListdata(){
        return exampleRepository.getCusterList();
    }
}
