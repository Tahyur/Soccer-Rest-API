/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.service.intfc;

/**
 *
 * @author tayor
 */
public interface ISoccerService {
    String getLeagueStandingsData(String id);
    String getCompetitonsPerCountryData(String id);
    String getMatchesResultsData(String id, String from, String to);
    String getTeamOneRecordData(String teamOne);
    String getTeamTwoRecordData(String teamTwo);
    String getHeadToHeadRecordData(String teamOne,String teamTwo);
}
