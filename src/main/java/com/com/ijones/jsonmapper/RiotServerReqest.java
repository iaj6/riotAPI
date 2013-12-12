package com.com.ijones.jsonmapper;

import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class RiotServerReqest {

    private static final String API_URL_1_1 = "http://prod.api.pvp.net/api/lol/{region}/v1.1/";
    private static final String  API_URL_2_1 = "http://prod.api.pvp.net/api/{region}/v2.1/";
    private static final String  API_KEY = "";
    public static final int  RATE_LIMIT_MINUTES = 50;
    public static final int  RATE_LIMIT_SECONDS = 5;
    public enum SUMMONER_OPTIONS {MASTERIES, RUNES, ID}
    public enum STATS_OPTIONS  {SUMMARY,RANKED}


    public static String getAllChampions(String region) throws Exception {
        String call = "champion";

        //add API URL to the call
        call = API_URL_1_1 + call;

        return request(region,call);
    }

    public static String getRecentGame(String region, long id) throws Exception {
        String call = "game/by-summoner/" + id + "/recent";

        //add API URL to the call
        call = API_URL_1_1 + call;

        return request(region,call);
    }

    public static String getLeague(String region, long id) throws Exception {
        String call = "league/by-summoner/" + id;

        //add API URL to the call
        call = API_URL_2_1 + call;

        return request(region, call);
    }

    public static String getStats(String region,long id, STATS_OPTIONS options)  throws Exception {
        String call = "stats/by-summoner/"  + id + "/";
        switch (options) {
            case SUMMARY:
                call += "summary";
                break;
            case RANKED:
                call += "ranked";
                break;
            default:
                break;
        }
        //add API URL to the call
        call = API_URL_1_1 + call;

        return request(region,call);
    }

    public static String getSummoner(String region, long id, SUMMONER_OPTIONS option) throws Exception {
        String call = "summoner/" + id;
        switch (option) {
            case MASTERIES:
                call += "/masteries";
                break;
            case RUNES:
                call += "/runes";
                break;
            case ID:
                // just return because the strings should is already
                // built
                break;
            default:
                //do nothing
                break;
        }
        //add API URL to the call
        call = API_URL_1_1 + call;
        return request(region,call);
    }

    public static String getSummonerNameListByIDs (String region, String idList) throws Exception{
        String call = "summoner/" + idList + "/name";
        call = API_URL_1_1 + call;
        return request(region, call);
    }

    public static String getSummonerByName(String region, String name) throws Exception {
        String call = "summoner/by-name/" + name;

        //add API URL to the call
        call = API_URL_1_1 + call;
        System.out.println("Call: " + call);
        return request(region,call);
    }

    public static String getTeam(String region, long id) throws Exception {
        String call = "team/by-summoner/" + id;

        //add API URL to the call
        call = API_URL_2_1 + call;

        return request(region, call);
    }

    private static String request (String region, String call) throws IOException, ParseException {
        URL request = new URL(formatURL(region, call));
        System.out.println("URL is: " + request.getPath());
        URLConnection api = request.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(api.getInputStream()));
        String output = IOUtils.toString(in);
        System.out.println("Output: \n" + output);
        return output;
    }

    //creates a full URL you can query on the API
    private static String formatURL(String region, String call){
        return call.replace("{region}", region) + "?api_key=" + API_KEY;
    }
}
