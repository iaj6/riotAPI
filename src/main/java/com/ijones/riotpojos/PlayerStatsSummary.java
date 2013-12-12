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
public class PlayerStatsSummary {
    @JsonDeserialize(contentAs=AggregatedStat.class)
    private List<AggregatedStat> aggregatedStats; //List of aggregated stats.
    private int losses; //Number of losses for this queue type. Returned for ranked queue types only.
    private long modifyDate; //Date stats were last modified specified as epoch milliseconds.
    private String modifyDateStr; //Human readable string representing date stats were last modified.
    private String playerStatSummaryType; //Player stats summary type. (legal values: AramUnranked5x5, CoopVsAI, OdinUnranked, RankedPremade3x3, RankedPremade5x5, RankedSolo5x5, RankedTeam3x3, RankedTeam5x5, Unranked, Unranked3x3)

    public PlayerStatsSummary() {

    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public List<AggregatedStat> getAggregatedStats() {
        return aggregatedStats;
    }

    public void setAggregatedStats(List<AggregatedStat> aggregatedStats) {
        this.aggregatedStats = aggregatedStats;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyDateStr() {
        return modifyDateStr;
    }

    public void setModifyDateStr(String modifyDateStr) {
        this.modifyDateStr = modifyDateStr;
    }

    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }

    public void setPlayerStatSummaryType(String playerStatSummaryType) {
        this.playerStatSummaryType = playerStatSummaryType;
    }

    int wins; //Number of wins for this queue type.


}
