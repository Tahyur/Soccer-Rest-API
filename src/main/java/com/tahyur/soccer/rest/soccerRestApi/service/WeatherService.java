/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.service;

import com.tahyur.soccer.rest.soccerRestApi.endpoints.WeatherEndpoints;
import com.tahyur.soccer.rest.soccerRestApi.service.intfc.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tayor
 */
@Service
public class WeatherService implements IWeatherService {

    @Autowired
    WeatherEndpoints weatherEndpoints;
    
    @Override
    public String getCurrentWeatherInformation() {
       return weatherEndpoints.getCurrentWeatherData();
    }
    
}
