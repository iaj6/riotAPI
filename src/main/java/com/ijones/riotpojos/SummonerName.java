package com.ijones.riotpojos;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class SummonerName {
    private long id; //Summoner ID.
    private String name; //Summoner name

    public SummonerName () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
