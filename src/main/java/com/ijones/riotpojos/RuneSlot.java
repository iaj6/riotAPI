package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class RuneSlot {
    @JsonDeserialize(contentAs = Rune.class)
    private Rune rune; //Rune associated with the rune slot.
    private int runeSlotId; //Rune slot ID.

    public RuneSlot() {

    }

    public int getRuneSlotId() {
        return runeSlotId;
    }

    public void setRuneSlotId(int runeSlotId) {
        this.runeSlotId = runeSlotId;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }
}
