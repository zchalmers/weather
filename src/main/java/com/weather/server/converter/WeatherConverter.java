package com.weather.server.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.server.service.model.forecast.ForecastDTO;
import com.weather.server.service.model.forecast.TestJson;

public class WeatherConverter {

    public static ForecastDTO convert(String json) {
        ObjectMapper mapper = new ObjectMapper();
        ForecastDTO data = null;
        try {
          data = mapper.readValue(json, ForecastDTO.class);
        }
        catch (Exception e){
            System.out.println("MAPPER READ JSON NOT WORK");
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static String forecastToMessage(TestJson forecast){
        String name = forecast.getLocation().getName();
        double tempF = forecast.getCurrent().getTemp_f();
        String high = Double.toString(forecast.getForecast().getForecastday().get(0).getDay().getMaxtemp_f());
        String low = Double.toString(forecast.getForecast().getForecastday().get(0).getDay().getMintemp_f());
        String rainPerc = Integer.toString(forecast.getForecast().getForecastday().get(0).getDay().getDaily_chance_of_rain());
        return String.format("In %s, it is currently %3.1f°F out. The high/low for the day is %s, and there is a %s%% chance of rain for the day.",
                name, tempF, String.format("%s°F/%s°F", high, low), rainPerc);
    }



}
