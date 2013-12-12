package com.ijones.riotpojos;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class MiniSeries {
    private int losses;
    private char[] progress;
    private int target;
    private long timeLeftToPlayMillis;

    public MiniSeries() {

    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public char[] getProgress() {
        return progress;
    }

    public void setProgress(char[] progress) {
        this.progress = progress;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public long getTimeLeftToPlayMillis() {
        return timeLeftToPlayMillis;
    }

    public void setTimeLeftToPlayMillis(long timeLeftToPlayMillis) {
        this.timeLeftToPlayMillis = timeLeftToPlayMillis;
    }

    int wins;
}
