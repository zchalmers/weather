package com.weather.server.service;


import com.weather.server.converter.WeatherConverter;
import com.weather.server.repository.UserRecord;
import com.weather.server.service.model.forecast.ForecastDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    SQLService sql;
    private RestTemplate restTemplate = new RestTemplate();
    private String url = "http://api.weatherapi.com/v1/forecast.json?key=7aefdac6c6404ca398315614231302&q=%s&days=1&aqi=no&alerts=no";

    public WeatherService(SQLService sql) {
        this.sql = sql;
    }

    public ForecastDTO getCurrentWeather (String location)  {

        String json = restTemplate.getForObject(String.format(url, location), String.class);
        ForecastDTO forecastDTO = WeatherConverter.convert(json);
        return forecastDTO;
    }

    public void sendTexts(){
        List<UserRecord> recordList = sql.getAllUsers();
        for (UserRecord r : recordList){
            ForecastDTO forecastDTO = getCurrentWeather(r.getLocation());
            try {
                ImageDrawing.draw(forecastDTO);
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            EmailService.sendEmail(r.getCarrier(), r.getPhoneNumber());
        }



    }

}
