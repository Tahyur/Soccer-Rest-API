/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.service;

import com.tahyur.soccer.rest.soccerRestApi.endpoints.SoccerEndpoints;
import com.tahyur.soccer.rest.soccerRestApi.service.intfc.ISoccerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tayor
 */
@Service
public class SoccerService implements ISoccerService{
    
    @Autowired
    SoccerEndpoints soccerEndpoints;

    @Override
    public String getCompetitonsPerCountryData(String id) {
        return soccerEndpoints.getCompetitonsPerCountry(id);
    }

    @Override
    public String getLeagueStandingsData(String id) {
        return soccerEndpoints.getLeagueStandingsData(id);
    }

    @Override
    public String getMatchesResultsData(String id, String from, String to) {
          return soccerEndpoints.getMatchesResultsData(id, from, to);
    }

    @Override
    public String getTeamOneRecordData(String teamOne) {
        return soccerEndpoints.getTeamOneRecordsData(teamOne);
    }

    @Override
    public String getTeamTwoRecordData(String teamTwo) {
        return soccerEndpoints.getTeamTwoRecordsData(teamTwo);
    }

    @Override
    public String getHeadToHeadRecordData(String teamOne, String teamTwo) {
        return soccerEndpoints.getHeadtoHeadRecordData(teamOne, teamTwo);
    }
    
}
