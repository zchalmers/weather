package com.weather.server.service.model.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastDTO {
    @JsonProperty("forecast")
    public Forecast forecast;
    @JsonProperty("current")
    public Current current;
    @JsonProperty("location")
    public Location location;

    public ForecastDTO(Forecast forecast, Current current, Location location) {
        this.forecast = forecast;
        this.current = current;
        this.location = location;
    }

    public ForecastDTO() {
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    @Override
    public String toString() {
        return "ForecastDTO{" +
                "forecast=" + forecast.toString() +
                ", current=" + current.toString() +
                ", location=" + location.toString() +
                '}';
    }
}
