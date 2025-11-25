package com.cmc.org.weather.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class TimelineResponse {
    private int queryCost;
    private double latitude;
    private double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private double tzoffset;
    private String description;


    private  List<Day> days;

    // Present if include=current or if current date is in range
    private  CurrentConditions  currentConditions;

    // Map of station id -> station info
    private  Map<String, Station> stations;

    TimelineResponse() {
        days = new ArrayList<>();
        currentConditions = null;
        stations = new HashMap<>();
    }
}
