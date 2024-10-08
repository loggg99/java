package com.example.tobi.springbootfeignclient.controller;

import com.example.tobi.springbootfeignclient.dto.weather.WeatherResponse;
import com.example.tobi.springbootfeignclient.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherResponse getWeatherData() {
        return weatherService.getWeatherData();
    }

}