package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class SummonerNameList {
    @JsonDeserialize(contentAs = SummonerName.class)
    private List<SummonerName> summoners; //The list of summoner name information.

    public SummonerNameList () {

    }

    public List<SummonerName> getSummoners() {
        return summoners;
    }

    public void setSummoners(List<SummonerName> summoners) {
        this.summoners = summoners;
    }
}
