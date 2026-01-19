package com.hotel.hotel.service;

import com.hotel.hotel.entity.Hotel;
import com.hotel.hotel.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelService {


    private final HotelRepository hotelRepository;

    public Hotel savehotel(Hotel hotel) {
        return hotelRepository.save(hotel);

    }


    public Hotel gethotel(Long id) {
        return hotelRepository.findById(id).orElseThrow();
    }
}
