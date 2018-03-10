package com.asm.springexample.repository;

import com.asm.springexample.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExampleRepository {


    static final List<Customer> custerList =new ArrayList<>();

    public Customer addToList(Customer c){
        custerList.add(c);
        return c;
    }

    public List<Customer> getCusterList(){
        return custerList;
    }

}
