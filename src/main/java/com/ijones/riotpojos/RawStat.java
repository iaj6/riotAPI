package com.ijones.riotpojos;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class RawStat {
    private int id; //Raw stat ID.
    private String name; //Raw stat name.

    public RawStat () {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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

    int value; //Raw stat value.
}
