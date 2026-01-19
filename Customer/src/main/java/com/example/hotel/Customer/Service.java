package com.example.hotel.Customer;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    private Repository respository;


    public List<Entity> findAll() {
        return respository.findAll();
    }

    public Entity saveCustomer(Entity entity) {
        return  respository.save(entity);

    }
}
