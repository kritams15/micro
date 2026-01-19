package com.hotel.hotel.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hotels")
@Data
@Builder
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    private String description;

    private Integer rating; // 1 to 5

    private Boolean active = true;

    public Hotel(Long id, String name, String location, String description, Integer rating, Boolean active) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.rating = rating;
        this.active = active;
    }

    public Hotel() {
    }
}
