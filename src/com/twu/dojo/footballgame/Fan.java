package com.twu.dojo.footballgame;

/**
 * Created by khusbooj on 04/02/15.
 */
public class Fan implements Attendee{
    private String teamName;
    public String reaction;
    public Fan(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getReaction() {
        return reaction;
    }

    @Override
    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    @Override
    public void reactToGoal(String teamWhoScored) {
        if(teamWhoScored.equals(teamName))
            setReaction("Yay!");
        else
            setReaction("Boo!");
    }
}
