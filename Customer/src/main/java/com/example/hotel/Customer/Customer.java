package com.example.hotel.Customer;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@jakarta.persistence.Entity
@Table(name="custumer")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private  String name;
    private int roomNum;
    private String hotelName;
    private Date checkn;
    private Date checkout;

}
