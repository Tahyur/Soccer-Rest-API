/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.endpoints;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author tayor
 */
@Component
public class WeatherEndpoints {
    private static final String URL = "https://api.openweathermap.org/data/2.5/weather?q=Toronto&units=metric&appid=81dd57d00e72795ee058e96ae60d433f";
    
    public String getCurrentWeatherData(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(URL, String.class);
        return result;
    }
}
