package com.weather.server.service.model.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    @JsonProperty("uv")
    public int uv;
    @JsonProperty("daily_chance_of_snow")
    public int daily_chance_of_snow;
    @JsonProperty("daily_will_it_snow")
    public int daily_will_it_snow;
    @JsonProperty("daily_chance_of_rain")
    public int daily_chance_of_rain;
    @JsonProperty("daily_will_it_rain")
    public int daily_will_it_rain;
    @JsonProperty("mintemp_f")
    public double mintemp_f;
    @JsonProperty("maxtemp_f")
    public double maxtemp_f;

    public Day(int uv, int daily_chance_of_snow, int daily_will_it_snow, int daily_chance_of_rain, int daily_will_it_rain, double mintemp_f, double maxtemp_f) {
        this.uv = uv;
        this.daily_chance_of_snow = daily_chance_of_snow;
        this.daily_will_it_snow = daily_will_it_snow;
        this.daily_chance_of_rain = daily_chance_of_rain;
        this.daily_will_it_rain = daily_will_it_rain;
        this.mintemp_f = mintemp_f;
        this.maxtemp_f = maxtemp_f;
    }

    public Day() {
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getDaily_chance_of_snow() {
        return daily_chance_of_snow;
    }

    public void setDaily_chance_of_snow(int daily_chance_of_snow) {
        this.daily_chance_of_snow = daily_chance_of_snow;
    }

    public int getDaily_will_it_snow() {
        return daily_will_it_snow;
    }

    public void setDaily_will_it_snow(int daily_will_it_snow) {
        this.daily_will_it_snow = daily_will_it_snow;
    }

    public int getDaily_chance_of_rain() {
        return daily_chance_of_rain;
    }

    public void setDaily_chance_of_rain(int daily_chance_of_rain) {
        this.daily_chance_of_rain = daily_chance_of_rain;
    }

    public int getDaily_will_it_rain() {
        return daily_will_it_rain;
    }

    public void setDaily_will_it_rain(int daily_will_it_rain) {
        this.daily_will_it_rain = daily_will_it_rain;
    }

    public double getMintemp_f() {
        return mintemp_f;
    }

    public void setMintemp_f(double mintemp_f) {
        this.mintemp_f = mintemp_f;
    }

    public double getMaxtemp_f() {
        return maxtemp_f;
    }

    public void setMaxtemp_f(double maxtemp_f) {
        this.maxtemp_f = maxtemp_f;
    }

    @Override
    public String toString() {
        return "Day{" +
                "uv=" + uv +
                ", daily_chance_of_snow=" + daily_chance_of_snow +
                ", daily_will_it_snow=" + daily_will_it_snow +
                ", daily_chance_of_rain=" + daily_chance_of_rain +
                ", daily_will_it_rain=" + daily_will_it_rain +
                ", mintemp_f=" + mintemp_f +
                ", maxtemp_f=" + maxtemp_f +
                '}';
    }
}
