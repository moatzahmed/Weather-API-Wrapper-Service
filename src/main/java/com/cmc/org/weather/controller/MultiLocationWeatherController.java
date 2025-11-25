package com.cmc.org.weather.controller;


import com.cmc.org.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bbc/news/weather/multi/locations/{locations}")
@RequiredArgsConstructor
public class MultiLocationWeatherController {
    private final WeatherService weatherService;

    @GetMapping("/forecasting")
    public ResponseEntity<?> multiLocationWeather(@PathVariable String locations) {
        return ResponseEntity.ok(weatherService.forcasatingMultiLocationWeather(locations));
    }
}
