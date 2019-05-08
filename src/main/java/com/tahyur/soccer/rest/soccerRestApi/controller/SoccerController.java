/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.controller;

import com.tahyur.soccer.rest.soccerRestApi.service.SoccerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tayor
 */
@RestController
@RequestMapping(value = "soccer", produces = MediaType.APPLICATION_JSON_VALUE)
public class SoccerController {
    
    @Autowired
    SoccerService service;
   
    
    @RequestMapping(value = "/competitions/{id}", method = RequestMethod.GET)
    
    public String getCompetitionsPerCountry(@PathVariable(name = "id") String id) {
        return service.getCompetitonsPerCountryData(id);
    }
    
    @RequestMapping(value = "/matches/{id}/{from}/{to}", method = RequestMethod.GET)
    public String getMatchesResults(@PathVariable(name = "id") String id,@PathVariable(name = "from") String from, @PathVariable(name = "to") String to){
        return service.getMatchesResultsData(id, from, to);
    }
    
    @RequestMapping(value ="/standings/{id}", method = RequestMethod.GET)
    public String getLeagueStandings(@PathVariable(name = "id") String id){
      return service.getLeagueStandingsData(id);
    }
    
    @RequestMapping(value="/record/one/{name}", method=RequestMethod.GET)
    public String getTeamOneRecordData(@PathVariable(name="name") String name){
        return service.getTeamOneRecordData(name);
    }
    
    @RequestMapping(value="/record/two/{name}", method=RequestMethod.GET)
    public String getTeamTwoRecordData(@PathVariable(name="name") String name){
        return service.getTeamTwoRecordData(name);
    }
    
    @RequestMapping(value="/h2h/{teamOne}/{teamTwo}", method=RequestMethod.GET)
    public String getHeadToHeadRecordData(@PathVariable(name="teamOne") String teamOne, @PathVariable(name="teamTwo") String teamTwo){
        return service.getHeadToHeadRecordData(teamOne, teamTwo);
    }
}
