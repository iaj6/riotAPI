package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 8:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class TeamStatSummary {
    @JsonDeserialize(contentAs = TeamID.class)
    private TeamID teamId;
    @JsonDeserialize(contentAs = TeamStatDetail.class)
    private Set<TeamStatDetail> teamStatDetails;

    public TeamStatSummary() {

    }

    public TeamID getTeamId() {
        return teamId;
    }

    public void setTeamId(TeamID teamId) {
        this.teamId = teamId;
    }

    public Set<TeamStatDetail> getTeamStatDetails() {
        return teamStatDetails;
    }

    public void setTeamStatDetails(Set<TeamStatDetail> teamStatDetails) {
        this.teamStatDetails = teamStatDetails;
    }
}
