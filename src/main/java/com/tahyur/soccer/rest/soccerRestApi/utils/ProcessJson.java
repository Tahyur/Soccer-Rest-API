/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tahyur.soccer.rest.soccerRestApi.utils;

import com.tahyur.soccer.rest.soccerRestApi.Constants.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author tayor
 */
@Component
public class ProcessJson {

    @Autowired
    Constants constantData;

    String data;

    public void setData() {
      //  this.data = constantData.getJsonData();
    }

    public String processJsonString() throws JSONException {
        String players = "\nHome Team \t\t Away Team\n";

        JSONObject object = new JSONObject(data);
        JSONArray array = object.getJSONArray("result");
        JSONObject object2 = array.getJSONObject(0);      

        return players;
    }

    public String getHomeTeamLineup() throws JSONException {
        String players = "\nHome Team\n";
        JSONObject object = new JSONObject(data);
        JSONArray array = object.getJSONArray("result");
        JSONObject object2 = array.getJSONObject(0);

        JSONObject object3 = object2.getJSONObject("lineups");

        JSONObject object4 = object3.getJSONObject("home_team");
        JSONArray array2 = object4.getJSONArray("starting_lineups");

        for (int i = 0; i < array2.length(); i++) {
            JSONObject ob6 = array2.getJSONObject(i);
            players += ob6.getString("player") + "\n";
        }

        return players;
    }
    
     public String getAwayTeamLineup() throws JSONException {
        String players = "\nAway Team\n";
        JSONObject object = new JSONObject(data);
        JSONArray array = object.getJSONArray("result");
        JSONObject object2 = array.getJSONObject(0);

        JSONObject object3 = object2.getJSONObject("lineups");

        JSONObject object4 = object3.getJSONObject("away_team");
        JSONArray array2 = object4.getJSONArray("starting_lineups");

        for (int i = 0; i < array2.length(); i++) {
            JSONObject ob6 = array2.getJSONObject(i);
            players += ob6.getString("player") + "\n";
        }

        return players;
    }
     
     public String getStatistics() throws JSONException {
         String output = "\n";
         JSONObject object = new JSONObject(data);
        JSONArray array = object.getJSONArray("result");
        JSONObject object2 = array.getJSONObject(0);
        
        JSONArray array2 = object2.getJSONArray("statistics");
        
        JSONObject ob3 = array2.getJSONObject(0);
        String type = ob3.getString("type");
        String home = ob3.getString("home");
        String away = ob3.getString("away");
        
        output += type+"\n"+"Home "+home+" "+away+" Away";
         return output;
     }
}
