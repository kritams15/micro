package com.hotel.rooms.controller;

import com.hotel.rooms.dto.RoomRequestDTO;
import com.hotel.rooms.dto.RoomResponseDTO;
import com.hotel.rooms.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    // Create room
    @PostMapping
    public ResponseEntity<RoomResponseDTO> createRoom(
            @RequestBody RoomRequestDTO request) {
        return new ResponseEntity<>(roomService.createRoom(request), HttpStatus.CREATED);
    }

    // Get all rooms for a hotel
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<RoomResponseDTO>> getRoomsByHotel(
            @PathVariable Long hotelId) {
        return ResponseEntity.ok(roomService.getRoomsByHotel(hotelId));
    }

    // Get available rooms
    @GetMapping("/hotel/{hotelId}/available")
    public ResponseEntity<List<RoomResponseDTO>> getAvailableRooms(
            @PathVariable Long hotelId) {
        return ResponseEntity.ok(roomService.getAvailableRooms(hotelId));
    }

    // Update room status
    @PutMapping("/{roomId}/status")
    public ResponseEntity<RoomResponseDTO> updateRoomStatus(
            @PathVariable Long roomId,
            @RequestParam String status) {
        return ResponseEntity.ok(roomService.updateRoomStatus(roomId, status));
    }
}
