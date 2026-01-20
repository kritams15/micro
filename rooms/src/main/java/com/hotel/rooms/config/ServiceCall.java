package com.hotel.rooms.config;

import com.hotel.rooms.entity.Hotel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class ServiceCall {

    private final WebClient webClient;

    public ServiceCall(WebClient webClient) {
        this.webClient = webClient;
    }

    public Hotel callServiceB(Long id) {

        Hotel response = webClient
                .get()
                .uri("http://localhost:8081/hotel/{id}", id)
                .retrieve()
                .bodyToMono(Hotel.class)
                .block();

        log.info("Response received from Service B for id {} : {}", id, response);
        return response;
    }
}
