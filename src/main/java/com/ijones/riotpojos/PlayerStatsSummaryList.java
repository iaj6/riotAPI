package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerStatsSummaryList {
    @JsonDeserialize(contentAs=PlayerStatsSummary.class)
    private List<PlayerStatsSummary> playerStatSummaries; //List of player stats summaries associated with the summoner.
    private long summonerId; //Summoner ID.

    PlayerStatsSummaryList() {

    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public List<PlayerStatsSummary> getPlayerStatSummaries() {
        return playerStatSummaries;
    }

    public void setPlayerStatSummaries(List<PlayerStatsSummary> playerStatSummaries) {
        this.playerStatSummaries = playerStatSummaries;
    }
}
