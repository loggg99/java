package com.example.tobi.catalog_service.web;

import com.example.tobi.catalog_service.Config.PolarProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final PolarProperties polarProperties;

    @GetMapping("/")
    public String getGreeting() {
        return polarProperties.getGreeting();
    }
}
