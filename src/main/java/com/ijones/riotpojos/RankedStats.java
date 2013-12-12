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
public class RankedStats {
    @JsonDeserialize(contentAs = ChampionStats.class)
    private List<ChampionStats> champions; //List of player stats summarized by champion.
    private long modifyDate; //Date stats were last modified specified as epoch milliseconds.
    private String modifyDateStr; //Human readable string representing date stats were last modified.
    private long summonerId; //Summoner ID.

    public RankedStats () {

    }

    public List<ChampionStats> getChampions() {
        return champions;
    }

    public void setChampions(List<ChampionStats> champions) {
        this.champions = champions;
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

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}
