package com.asm.springexample.repository;

import com.asm.springexample.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
        String SELECT_CUSTOMER_BY_ID = "select id ,age , name from customer where id = 'X'";

        String SELECT_ALL_CUSTOMERS = "select id ,age , name from customer";

        String INSERT_CUSTOMER = "INSERT INTO public.customer(id, age, name) VALUES ('XX', YY, 'ZZ')";

    public Customer getCustomerById(String id) {

        Customer customer = null;
        try {
            String query = SELECT_CUSTOMER_BY_ID.replace("X", id) ;
            Map map  = jdbcTemplate.queryForMap(query);
            customer = new Customer((String )map.get("id"),((BigDecimal) map.get("age")).intValue(),(String)map.get("name"));
        } catch (Exception e) {
            System.out.print(" error " + e.getMessage());
        }

        return customer;
    }

    public List<Customer> getCustomerList() {
        return jdbcTemplate.queryForList(SELECT_ALL_CUSTOMERS).stream().map(map-> new Customer((String )map.get("id"),((BigDecimal) map.get("age")).intValue(),(String)map.get("name"))).collect(Collectors.toList());
    }

    public String addCustomer(Customer c) {
        String message = "";
        try {
            jdbcTemplate.update(INSERT_CUSTOMER
                    .replace("XX", c.getId())
                    .replace("YY", "" + c.getAge())
                    .replace("ZZ", c.getName()));
            message = "Customer save correctly";
        } catch (Exception e) {
            message = "could not save a customer  :: " + e.getMessage();
            System.out.print(message);
        }

        return message;
    }
}
