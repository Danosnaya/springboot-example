package com.asm.springexample.controller;

import com.asm.springexample.model.Customer;
import com.asm.springexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/{customer}/detail", method = RequestMethod.GET)
    @ResponseBody
    public Customer sayHello(@PathVariable("customer") String customerId) {
        return customerService.getCustomerById(customerId);
    }

    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getList() {
        return customerService.getCustomerList();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addCustomer( @RequestBody Map body) {

        Customer customer = new Customer(UUID.randomUUID().toString(),(int)body.get("age"),(String)body.get("name"));
        return customerService.addCustomer(customer);
    }
}
