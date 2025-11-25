package com.cmc.org.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class MultiTimelineResponse {
    private List<com.cmc.org.weather.dto.TimelineResponse> locations;
}
