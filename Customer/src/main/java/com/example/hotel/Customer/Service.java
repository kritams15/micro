package com.example.hotel.Customer;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    private Repository respository;


    public List<Customer> findAll() {
        return respository.findAll();
    }

    public Customer saveCustomer(Customer entity) {
        return  respository.save(entity);

    }
}
