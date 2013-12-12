package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class MasteryPage {
    private boolean current; //Indicates if the mastery page is the current mastery page.
    private String name; //Mastery page name.
    @JsonDeserialize(contentAs = Talent.class)
    private List<Talent> talents; //List of mastery page talents associated with the mastery page.

    public MasteryPage () {

    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }
}
