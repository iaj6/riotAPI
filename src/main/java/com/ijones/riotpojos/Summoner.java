package com.ijones.riotpojos;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Summoner {
    private long id;	//Summoner ID.
    private String name;		//Summoner name.
    private int profileIconId; //ID of the summoner icon associated with the summoner.a
    private long revisionDate; //Date summoner was last modified specified as epoch milliseconds.
    private String revisionDateStr; //Human readable string representing date summoner was last modified.
    private long summonerLevel; //Summoner level associated with the summoner.

    public Summoner () {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getRevisionDateStr() {
        return revisionDateStr;
    }

    public void setRevisionDateStr(String revisionDateStr) {
        this.revisionDateStr = revisionDateStr;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }


}
