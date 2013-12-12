package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private int championId; //Champion ID associated with game.
    private long createDate; //game was played specified as epoch milliseconds.
    private String createDateStr; //Human readable string representing date game was played.
    @JsonDeserialize(contentAs=Player.class)
    private List<Player> fellowPlayers; //Other players associated with the game.
    private long gameId; //Game ID.
    private String gameMode; //Game mode.
    private String gameType; //Game type.
    private boolean invalid; //Invalid flag.
    private int level; //Level.
    private int mapId; //Map ID.
    private int spell1; //ID of first summoner spell.
    private int spell2; //ID of second summoner spell.
    @JsonDeserialize(contentAs=RawStat.class)
    private List<RawStat>statistics; //Statistics associated with the game for this summoner.
    private String subType; //Game sub-type.
    private int teamId; //Team ID associated with game.

    public Game() {

    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public String getCreateDateStr() {
        return createDateStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }

    public List<Player> getFellowPlayers() {
        return fellowPlayers;
    }

    public void setFellowPlayers(List<Player> fellowPlayers) {
        this.fellowPlayers = fellowPlayers;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int getSpell1() {
        return spell1;
    }

    public void setSpell1(int spell1) {
        this.spell1 = spell1;
    }

    public int getSpell2() {
        return spell2;
    }

    public void setSpell2(int spell2) {
        this.spell2 = spell2;
    }

    public List<RawStat> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<RawStat> statistics) {
        this.statistics = statistics;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
