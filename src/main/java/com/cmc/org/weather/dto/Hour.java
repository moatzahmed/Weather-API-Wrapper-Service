package com.cmc.org.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Hour {

    private String datetime;
    private long datetimeEpoch;

    private Double temp;
    private Double feelslike;
    private Double humidity;
    private Double dew;
    private Double precip;
    private Double precipprob;
    private Double snow;
    private Double snowdepth;

    private Double windspeed;
    private Double windgust;
    private Double winddir;
    private Double pressure;
    private Double cloudcover;
    private Double visibility;

    private String conditions;
    private String icon;
}
