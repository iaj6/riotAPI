package com.ijones.riotpojos;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MessageOfDay {
    private long createDate;
    private String message;
    private int version;

    public MessageOfDay() {

    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
