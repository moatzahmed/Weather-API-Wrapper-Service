package com.cmc.org.weather.service;


import com.cmc.org.weather.dto.MultiTimelineResponse;
import com.cmc.org.weather.dto.TimelineResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final RestTemplate restTemplate;
    private final Environment env;

    @Cacheable(value = "weatherLocation", key = "#location")
    public TimelineResponse forcasatingSingleLocationWeather(String location) {
        String url = env.getProperty("weather.api.url") + location + "?key=" + env.getProperty("weather.api.key");
        TimelineResponse retVal = restTemplate.getForObject(url, TimelineResponse.class);

        return retVal;
    }

    @Cacheable(value = "weatherDate", key = "#location + '_' + #date")
    public TimelineResponse getWeatherBySingleLocationAndDate(String location, String date) {
        String url = env.getProperty("weather.api.url") + location + "/" + date + "?key=" + env.getProperty("weather.api.key");
        TimelineResponse retVal = restTemplate.getForObject(url, TimelineResponse.class);
        return retVal;
    }

@Cacheable(value = "weatherMultiLocation", key = "#locations")
    public MultiTimelineResponse forcasatingMultiLocationWeather(String locations) {
        String url = env.getProperty("weather.api.url") + locations + "?key=" + env.getProperty("weather.api.key");
        MultiTimelineResponse retVal = restTemplate.getForObject(url, MultiTimelineResponse.class);
        return retVal;
    }

}