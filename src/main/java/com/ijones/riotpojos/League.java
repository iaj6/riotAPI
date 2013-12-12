package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class League {
    @JsonDeserialize(contentAs=LeagueItem.class)
    private List<LeagueItem> entries;
    private String name;
    private String queue; //(legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5)
    private String tier; //(legal values: CHALLENGER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE)

    public League () {

    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public List<LeagueItem> getEntries() {
        return entries;
    }

    public void setEntries(List<LeagueItem> entries) {
        this.entries = entries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    long timestamp;
}
