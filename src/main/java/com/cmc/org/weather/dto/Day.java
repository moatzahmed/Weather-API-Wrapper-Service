package com.cmc.org.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Day {
    private String datetime;
    private long datetimeEpoch;

    private Double tempmax;
    private Double tempmin;
    private Double temp;
    private Double humidity;
    private Double precip;
    private Double precipprob;
    private Double windspeed;
    private Double windgust;
    private Double pressure;
    private Double cloudcover;

    private String sunrise;
    private String sunset;
    private String conditions;
    private String icon;

    private List<String> stations;  // station IDs used
    private List<com.cmc.org.weather.dto.Hour> hours;       // hourly data if include=hours
}
