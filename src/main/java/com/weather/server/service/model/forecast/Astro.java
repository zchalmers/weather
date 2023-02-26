package com.weather.server.service.model.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Astro {
    @JsonProperty("moon_phase")
    public String moon_phase;
    @JsonProperty("moonset")
    public String moonset;
    @JsonProperty("moonrise")
    public String moonrise;
    @JsonProperty("sunset")
    public String sunset;
    @JsonProperty("sunrise")
    public String sunrise;

    public Astro(String moon_phase, String moonset, String moonrise, String sunset, String sunrise) {
        this.moon_phase = moon_phase;
        this.moonset = moonset;
        this.moonrise = moonrise;
        this.sunset = sunset;
        this.sunrise = sunrise;
    }

    public Astro(String moonrise, String sunset, String sunrise) {
        this.moonrise = moonrise;
        this.sunset = sunset;
        this.sunrise = sunrise;
    }

    public Astro() {
    }

    public String getMoon_phase() {
        return moon_phase;
    }

    public void setMoon_phase(String moon_phase) {
        this.moon_phase = moon_phase;
    }

    public String getMoonset() {
        return moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @Override
    public String toString() {
            return "moonrise = '" + moonrise + "'\r\n"
                    + "sunset = '" + sunset + "'\r\n"
                    + "sunrise = '" + sunrise + "'";

    }
}
