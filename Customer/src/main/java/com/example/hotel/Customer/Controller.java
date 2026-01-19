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
        private ResponseEntity<Entity> saveCustomer(@RequestBody Entity entity){
            return ResponseEntity.ok(service.saveCustomer(entity));
        }
        @GetMapping
        private ResponseEntity<List<Entity>> getAllCustomers(){
            return ResponseEntity.ok(service.findAll());
        }
    }
