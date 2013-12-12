package com.ijones.riotpojos;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class AggregatedStat {
    private int count; //Aggregated stat value.
    private int id; //Aggregated stat type ID.
    private String name; //Aggregated stat type name.

    public AggregatedStat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
