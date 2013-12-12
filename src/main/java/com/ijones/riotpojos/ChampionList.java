package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChampionList {
    @JsonDeserialize(contentAs=Champion.class)
    private List<Champion> champions; //The list of champion information.

    public ChampionList () {

    }

    public List<Champion> getChampions (){
        return this.champions;
    }

    public void setChampions (List<Champion> champions) {
        this.champions = champions;
    }
}
