    package com.example.hotel.Customer;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/cus")
    public class Controller {

        @Autowired
       private Service service;

        @PostMapping
        private ResponseEntity<Customer> saveCustomer(@RequestBody Customer entity){
            return ResponseEntity.ok(service.saveCustomer(entity));
        }
        @GetMapping
        private ResponseEntity<List<Customer>> getAllCustomers(){
            return ResponseEntity.ok(service.findAll());
        }
    }
