package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecentGames {

    @JsonDeserialize(contentAs=Game.class)
    private List<Game> games; //List of recent games played (max 10).

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    long summonerId; //Summoner ID.

}
