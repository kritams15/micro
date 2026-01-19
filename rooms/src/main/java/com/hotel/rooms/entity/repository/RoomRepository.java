package com.hotel.rooms.entity.repository;


import com.hotel.rooms.entity.Room;
import com.hotel.rooms.entity.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByHotelId(Long hotelId);

    List<Room> findByHotelIdAndStatus(Long hotelId, RoomStatus status);
}
