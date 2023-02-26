package com.weather.server.service.model.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {
    @JsonProperty("temp_f")
    public double temp_f;

    public Current(double temp_f) {
        this.temp_f = temp_f;
    }

    public Current() {
    }

    @Override
    public String toString() {
        return "Current{" +
                "temp_f=" + temp_f +
                '}';
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }
}
