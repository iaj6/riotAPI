package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 6:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunePages {
    @JsonDeserialize(contentAs = RunePage.class)
    private Set<RunePage> pages; //Set of rune pages associated with the summoner.
    private long summonerId; //Summoner ID.

    public RunePages() {

    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public Set<RunePage> getPages() {
        return pages;
    }

    public void setPages(Set<RunePage> pages) {
        this.pages = pages;
    }



}
