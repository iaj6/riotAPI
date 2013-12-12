package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Team {
    private long createDate;
    private long lastGameDate;
    private long lastJoinDate;
    private long lastJoinedRankedTeamQueueDate;
    @JsonDeserialize(contentAs = MatchHistorySummary.class)
    private List<MatchHistorySummary> matchHistory;
    @JsonDeserialize(contentAs = MessageOfDay.class)
    private MessageOfDay messageOfDay;
    private long modifyDate;
    private String name;
    private Roster roster;
    private long secondLastJoinDate;
    private String status;
    private String tag;
    @JsonDeserialize(contentAs = TeamID.class)
    private TeamID teamId;
    @JsonDeserialize(contentAs = TeamStatSummary.class)
    private TeamStatSummary teamStatSummary;
    private long thirdLastJoinDate;
    private long timestamp;

    public Team() {

    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public long getLastGameDate() {
        return lastGameDate;
    }

    public void setLastGameDate(long lastGameDate) {
        this.lastGameDate = lastGameDate;
    }

    public long getLastJoinDate() {
        return lastJoinDate;
    }

    public void setLastJoinDate(long lastJoinDate) {
        this.lastJoinDate = lastJoinDate;
    }

    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public void setLastJoinedRankedTeamQueueDate(long lastJoinedRankedTeamQueueDate) {
        this.lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate;
    }

    public List<MatchHistorySummary> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(List<MatchHistorySummary> matchHistory) {
        this.matchHistory = matchHistory;
    }

    public MessageOfDay getMessageOfDay() {
        return messageOfDay;
    }

    public void setMessageOfDay(MessageOfDay messageOfDay) {
        this.messageOfDay = messageOfDay;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Roster getRoster() {
        return roster;
    }

    public void setRoster(Roster roster) {
        this.roster = roster;
    }

    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public void setSecondLastJoinDate(long secondLastJoinDate) {
        this.secondLastJoinDate = secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public TeamID getTeamId() {
        return teamId;
    }

    public void setTeamId(TeamID teamId) {
        this.teamId = teamId;
    }

    public TeamStatSummary getTeamStatSummary() {
        return teamStatSummary;
    }

    public void setTeamStatSummary(TeamStatSummary teamStatSummary) {
        this.teamStatSummary = teamStatSummary;
    }

    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }

    public void setThirdLastJoinDate(long thirdLastJoinDate) {
        this.thirdLastJoinDate = thirdLastJoinDate;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
