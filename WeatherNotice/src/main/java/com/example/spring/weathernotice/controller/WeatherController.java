package com.example.spring.weathernotice.controller;

import com.example.spring.weathernotice.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather")
    public String weather() {
        return weatherService.
    }
}
