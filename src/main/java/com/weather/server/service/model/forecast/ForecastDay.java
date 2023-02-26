package com.weather.server.service.model.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastDay {
    @JsonProperty("astro")
    public Astro astro;
    @JsonProperty("day")
    public Day day;

    public ForecastDay(Astro astro, Day day) {
        this.astro = astro;
        this.day = day;
    }

    public ForecastDay() {
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Forecastday{" +
                "astro=" + astro.toString() +
                ", day=" + day.toString() +
                '}';
    }
}
