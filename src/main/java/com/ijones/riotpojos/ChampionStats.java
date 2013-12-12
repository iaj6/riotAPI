package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChampionStats {
    private int id; //Champion id.
    private  String name; //Champion name.
    @JsonDeserialize(contentAs = ChampionStat.class)
    List<ChampionStat> stats; //List of stats associated with the champion.

    public ChampionStats() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChampionStat> getStats() {
        return stats;
    }

    public void setStats(List<ChampionStat> stats) {
        this.stats = stats;
    }
}
