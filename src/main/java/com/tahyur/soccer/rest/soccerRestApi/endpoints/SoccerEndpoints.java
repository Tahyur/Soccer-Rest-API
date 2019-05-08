/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.endpoints;

import com.tahyur.soccer.rest.soccerRestApi.Constants.Constants;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author tayor
 */
@Component
public class SoccerEndpoints {

     public String getLeagueStandingsData(String id){
         try {
            URIBuilder builder = new URIBuilder(Constants.BASE_URL);
            builder.addParameter(Constants.ACTION, Constants.ACTION_STANDINGS);
            builder.addParameter(Constants.LEAGUE_ID, id);
            builder.addParameter(Constants.API, Constants.API_KEY);

            URL url = builder.build().toURL();

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url.toURI(), String.class);
            return result;
        } catch (URISyntaxException | MalformedURLException ex) {
            return ex.getMessage();
        }
    }

    public String getCompetitonsPerCountry(String id) {
        try {
            URIBuilder builder = new URIBuilder(Constants.BASE_URL);
            builder.addParameter(Constants.ACTION, "get_leagues");
            builder.addParameter(Constants.COUNTRY_ID, id);
            builder.addParameter(Constants.API, Constants.API_KEY);

            URL url = builder.build().toURL();

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url.toURI(), String.class);
            return result;
        } catch (URISyntaxException | MalformedURLException ex) {
            return ex.getMessage();
        }
    }

    public String getMatchesResultsData(String id, String from, String to) {
        try {
            URIBuilder builder = new URIBuilder(Constants.BASE_URL);
            builder.addParameter(Constants.ACTION, Constants.ACTION_EVENT);
            builder.addParameter(Constants.FROM, from);
            builder.addParameter(Constants.TO, to);
            builder.addParameter(Constants.LEAGUE_ID, id);
            builder.addParameter(Constants.API, Constants.API_KEY);

            URL url = builder.build().toURL();

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url.toURI(), String.class);
            return result;
        } catch (URISyntaxException | MalformedURLException ex) {
            return ex.getMessage();
        }
    }
    
    public String getTeamOneRecordsData(String teamOne){       
        String teamTwo = "_";
        try {
            URIBuilder builder = new URIBuilder(Constants.BASE_URL);
            builder.addParameter(Constants.ACTION, Constants.ACTION_H2H);
            builder.addParameter(Constants.FIRST_TEAM, teamOne);
            builder.addParameter(Constants.SECOND_TEAM, teamTwo);
            builder.addParameter(Constants.API, Constants.API_KEY);

            URL url = builder.build().toURL();

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url.toURI(), String.class);
            return result;
        } catch (URISyntaxException | MalformedURLException ex) {
            return ex.getMessage();
        }
    }
    
    public String getTeamTwoRecordsData(String teamTwo){       
        String teamOne = "_";
        try {
            URIBuilder builder = new URIBuilder(Constants.BASE_URL);
            builder.addParameter(Constants.ACTION, Constants.ACTION_H2H);
            builder.addParameter(Constants.FIRST_TEAM, teamOne);
            builder.addParameter(Constants.SECOND_TEAM, teamTwo);
            builder.addParameter(Constants.API, Constants.API_KEY);

            URL url = builder.build().toURL();

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url.toURI(), String.class);
            return result;
        } catch (URISyntaxException | MalformedURLException ex) {
            return ex.getMessage();
        }
    }
    
    public String getHeadtoHeadRecordData(String teamOne, String teamTwo){         
        try {
            URIBuilder builder = new URIBuilder(Constants.BASE_URL);
            builder.addParameter(Constants.ACTION, Constants.ACTION_H2H);
            builder.addParameter(Constants.FIRST_TEAM, teamOne);
            builder.addParameter(Constants.SECOND_TEAM, teamTwo);
            builder.addParameter(Constants.API, Constants.API_KEY);

            URL url = builder.build().toURL();

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url.toURI(), String.class);
            return result;
        } catch (URISyntaxException | MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
        return "";
    }
}
