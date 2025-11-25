package com.cmc.org.weather.controller;

import com.cmc.org.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bbc/news/weather/location/{location}")
@RequiredArgsConstructor
public class SingleLocationWeatherController {

    private final WeatherService weatherService;

    @GetMapping("/forecasting")
    public ResponseEntity<?> forcastingWeatherLocation(@PathVariable String location) {
        return ResponseEntity.ok(weatherService.forcasatingSingleLocationWeather(location));
    }

    @GetMapping("date/{date}")
    public ResponseEntity<?> weatherByLocationAndDate(@PathVariable String location, @PathVariable String date) {
        return ResponseEntity.ok(weatherService.getWeatherBySingleLocationAndDate(location, date));
    }
}
