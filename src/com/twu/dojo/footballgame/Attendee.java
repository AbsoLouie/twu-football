package com.twu.dojo.footballgame;

/**
 * Created by khusbooj on 04/02/15.
 */
public interface Attendee {
    public void reactToGoal(String teamWhoScored);

    void setReaction(String reaction);

    String getReaction();
}
