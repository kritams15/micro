package com.hotel.hotel.controller;

import com.hotel.hotel.entity.Hotel;
import com.hotel.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
        Hotel saveHotel = hotelService.savehotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveHotel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable long  id){
        return ResponseEntity.ok(hotelService.gethotel(id));
    }


}
