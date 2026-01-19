package com.hotel.rooms.service;

import com.hotel.rooms.dto.RoomRequestDTO;
import com.hotel.rooms.dto.RoomResponseDTO;
import com.hotel.rooms.entity.Room;
import com.hotel.rooms.entity.RoomStatus;
import com.hotel.rooms.entity.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Override
    public RoomResponseDTO createRoom(RoomRequestDTO request) {

        Room room = Room.builder()
                .hotelId(request.getHotelId())
                .roomNumber(request.getRoomNumber())
                .roomType(request.getRoomType())
                .price(request.getPrice())
                .status(RoomStatus.AVAILABLE)
                .build();

        return mapToResponse(roomRepository.save(room));
    }

    @Override
    public List<RoomResponseDTO> getRoomsByHotel(Long hotelId) {
        return roomRepository.findByHotelId(hotelId)
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<RoomResponseDTO> getAvailableRooms(Long hotelId) {
        return roomRepository.findByHotelIdAndStatus(hotelId, RoomStatus.AVAILABLE)
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public RoomResponseDTO updateRoomStatus(Long roomId, String status) {

        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new RuntimeException("Room not found"));

        room.setStatus(RoomStatus.valueOf(status.toUpperCase()));

        return mapToResponse(roomRepository.save(room));
    }

    private RoomResponseDTO mapToResponse(Room room) {
        return RoomResponseDTO.builder()
                .id(room.getId())
                .hotelId(room.getHotelId())
                .roomNumber(room.getRoomNumber())
                .roomType(room.getRoomType())
                .price(room.getPrice())
                .status(room.getStatus())
                .build();
    }
}
