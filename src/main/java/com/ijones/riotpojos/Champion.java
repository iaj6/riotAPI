package com.ijones.riotpojos;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Champion {
    private boolean active; //Indicates if the champion is active.
    private int attackRank; //Champion attack rank.
    private boolean botEnabled; //Bot enabled flag (for custom games).
    private boolean botMmEnabled; //Bot Match Made enabled flag (for Co-op vs. AI games).
    private int defenseRank; //Champion defense rank.
    private int difficultyRank; //Champion difficulty rank.
    private boolean freeToPlay; //Indicates if the champion is free to play. Free to play champions are rotated periodically.
    private long id; //Champion ID.
    private int magicRank; //Champion magic rank.
    private String name; //Champion name.
    private boolean rankedPlayEnabled; //Ranked play enabled flag.

    public Champion () {

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getAttackRank() {
        return attackRank;
    }

    public void setAttackRank(int attackRank) {
        this.attackRank = attackRank;
    }

    public boolean isBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public int getDefenseRank() {
        return defenseRank;
    }

    public void setDefenseRank(int defenseRank) {
        this.defenseRank = defenseRank;
    }

    public int getDifficultyRank() {
        return difficultyRank;
    }

    public void setDifficultyRank(int difficultyRank) {
        this.difficultyRank = difficultyRank;
    }

    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMagicRank() {
        return magicRank;
    }

    public void setMagicRank(int magicRank) {
        this.magicRank = magicRank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

}
