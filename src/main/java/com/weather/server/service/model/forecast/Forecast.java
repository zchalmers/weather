package com.weather.server.service.model.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Forecast  {
    @JsonProperty("forecastday")
    public ArrayList<ForecastDay> forecastday;

    public Forecast(ArrayList<ForecastDay> forecastday) {
        this.forecastday = forecastday;
    }

    public Forecast() {
    }

    public List<ForecastDay> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<ForecastDay> forecastday) {
        this.forecastday = forecastday;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "forecastday=" + forecastday.toString() +
                '}';
    }
}
