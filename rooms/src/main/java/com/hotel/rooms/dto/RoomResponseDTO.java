package com.hotel.rooms.dto;

import com.hotel.rooms.entity.RoomStatus;
import com.hotel.rooms.entity.RoomType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class RoomResponseDTO {

    private Long id;
    private Long hotelId;
    private String roomNumber;
    private RoomType roomType;
    private BigDecimal price;
    private RoomStatus status;

}
