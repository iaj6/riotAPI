package com.ijones.riotpojos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChampionStat {
    private int count; //Count of samples (games) that make up the aggregated value, where relevant.
    private int id; //Aggregated stat type ID.
    private String name; //Aggregated stat type name.
    private int value; //	Aggregated stat value.

    public ChampionStat () {

    }

    public int getCount() {
        return count;
    }

    @JsonProperty("c")
    public void setCount(int count) {
        this.count = count;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
