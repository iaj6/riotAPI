package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunePage {
    private boolean current; //Indicates if the page is the current page.
    private long id; //Rune page ID.
    private String name; //Rune page name.
    @JsonDeserialize(contentAs = RuneSlot.class)
    private List<RuneSlot> slots; //List of rune slots associated with the rune page.

    public RunePage() {

    }

    public List<RuneSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<RuneSlot> slots) {
        this.slots = slots;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
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
}
