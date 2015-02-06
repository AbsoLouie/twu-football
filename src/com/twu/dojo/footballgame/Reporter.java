package com.twu.dojo.footballgame;

/**
 * Created by khusbooj on 04/02/15.
 */
public class Reporter implements Attendee {

    private String reaction;

    public Reporter() {
    }

    @Override
    public void reactToGoal(String teamWhoScored) {
        setReaction("Team " + teamWhoScored + " scored");
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
