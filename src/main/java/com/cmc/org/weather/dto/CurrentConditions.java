package com.cmc.org.weather.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class CurrentConditions {
    private String datetime;
    private long datetimeEpoch;

    private Double temp;
    private Double feelslike;
    private Double humidity;
    private Double dew;
    private Double windspeed;
    private Double windgust;
    private Double winddir;
    private Double pressure;
    private Double cloudcover;
    private Double visibility;
    private Double precip;

    private String conditions;
    private String icon;
}
