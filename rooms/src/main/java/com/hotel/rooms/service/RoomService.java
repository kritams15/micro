package com.hotel.rooms.service;

import com.hotel.rooms.dto.RoomRequestDTO;
import com.hotel.rooms.dto.RoomResponseDTO;

import java.util.List;

public interface RoomService {

    RoomResponseDTO createRoom(RoomRequestDTO request);

    List<RoomResponseDTO> getRoomsByHotel(Long hotelId);

    List<RoomResponseDTO> getAvailableRooms(Long hotelId);

    RoomResponseDTO updateRoomStatus(Long roomId, String status);
}
