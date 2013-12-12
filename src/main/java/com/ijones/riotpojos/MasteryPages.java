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
public class MasteryPages {
    @JsonDeserialize(contentAs = MasteryPage.class)
    private List<MasteryPage> pages; //List of mastery pages associated with the summoner.
    private long summonerId; //Summoner ID.

    public MasteryPages () {

    }

    public List<MasteryPage> getPages() {
        return pages;
    }

    public void setPages(List<MasteryPage> pages) {
        this.pages = pages;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}
