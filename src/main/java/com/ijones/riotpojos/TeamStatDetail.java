package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class TeamStatDetail {
    private int averageGamesPlayed;
    private int losses;
    private int maxRating;
    private int rating;
    private int seedRating;
    @JsonDeserialize(contentAs = TeamID.class)
    private TeamID teamId;
    private String teamStatType;
    private int wins;

    public TeamStatDetail() {

    }

    public int getAverageGamesPlayed() {
        return averageGamesPlayed;
    }

    public void setAverageGamesPlayed(int averageGamesPlayed) {
        this.averageGamesPlayed = averageGamesPlayed;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(int maxRating) {
        this.maxRating = maxRating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSeedRating() {
        return seedRating;
    }

    public void setSeedRating(int seedRating) {
        this.seedRating = seedRating;
    }

    public TeamID getTeamId() {
        return teamId;
    }

    public void setTeamId(TeamID teamId) {
        this.teamId = teamId;
    }

    public String getTeamStatType() {
        return teamStatType;
    }

    public void setTeamStatType(String teamStatType) {
        this.teamStatType = teamStatType;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
