/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.controller;

import com.tahyur.soccer.rest.soccerRestApi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tayor
 */
@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;
    
    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    public String getCurrentWeatherData(){
        return weatherService.getCurrentWeatherInformation();
    }
}
