package com.hotel.rooms.dto;

import com.hotel.rooms.entity.RoomType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RoomRequestDTO {

    private Long hotelId;
    private String roomNumber;
    private RoomType roomType;
    private BigDecimal price;
}
