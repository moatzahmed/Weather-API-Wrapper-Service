package com.cmc.org.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Station {
    private String name;
    private Double latitude;
    private Double longitude;
    private Double distance;

}
