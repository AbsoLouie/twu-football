package com.twu.dojo.footballgame;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by khusbooj on 04/02/15.
 */
public class FanTest {
    @Test
    public void shouldReactToGoalPositively() {
        Fan fanOfTeamA = new Fan("A");
        fanOfTeamA.reactToGoal("A");
        assertThat(fanOfTeamA.getReaction(), is("Yay!"));
    }

    @Test
    public void shouldReactToGoalNegatively() {
        Fan fanOfTeamA = new Fan("A");
        fanOfTeamA.reactToGoal("B");
        assertThat(fanOfTeamA.getReaction(), is("Boo!"));
    }


}
