package com.hotel.rooms.entity;


import lombok.Data;

@Data
public class Hotel {
    private Long id;
    private String name;
    private String location;
    private String description;
    private Integer rating; // 1 to 5
    private Boolean active = true;
}
