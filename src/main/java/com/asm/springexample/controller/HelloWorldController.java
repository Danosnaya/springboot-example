package com.asm.springexample.controller;

import com.asm.springexample.model.Customer;
import com.asm.springexample.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by LecAnibal on 10/25/17.
 */
@Controller
@RequestMapping("/customers")
public class HelloWorldController {

    @Autowired
    ExampleService exampleService;



    private static final String template = "Hi!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value= "/{customer}/detail",method= RequestMethod.GET)
    public @ResponseBody
    Customer sayHello(@PathVariable("customer") String customerId,
                      @RequestParam(value="name", required=false, defaultValue="deafult") String name) {
        return exampleService.getSomeData (customerId,name);
    }

    @RequestMapping(value= "/list",method= RequestMethod.GET)
    public @ResponseBody
    List<Customer> getList() {
        return exampleService.getListdata();
    }

}
