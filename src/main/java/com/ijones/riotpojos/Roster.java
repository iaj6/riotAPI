package com.ijones.riotpojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Roster {
    @JsonDeserialize(contentAs = TeamMemberInfo.class)
    private List<TeamMemberInfo> memberList;
    private long ownerId;

    public Roster() {

    }

    public List<TeamMemberInfo> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<TeamMemberInfo> memberList) {
        this.memberList = memberList;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }
}
