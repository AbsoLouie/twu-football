package com.twu.dojo.footballgame;

/**
 * Created by lperez on 2/6/15.
 */
public class ScoreKeeper implements Attendee {

    private String teamOne;
    private String teamTwo;
    private String reaction;
    private int teamOneScore = 0;
    private int teamTwoScore = 0;

    public ScoreKeeper(String teamOne, String teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    @Override
    public void reactToGoal(String teamWhoScored) {
        if (teamOne == teamWhoScored)  teamOneScore++;
        if (teamTwo == teamWhoScored)  teamTwoScore++;
        setReaction("Team " + teamOne + ": " + teamOneScore  + ", " + "Team " + teamTwo + ": " + teamTwoScore);
    }

    @Override
    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    @Override
    public String getReaction() {
        return reaction;
    }

}