package com.twu.dojo.footballgame;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ScoreKeeperTest {

    @Test
    public void testReactToTeamAGoal()  {
        ScoreKeeper scoreKeeper = new ScoreKeeper("A", "B");
        scoreKeeper.reactToGoal("A");
        assertThat(scoreKeeper.getReaction(), is("Team A: 1, Team B: 0"));
    }

    @Test
    public void testReactToTeamBGoal()  {
        ScoreKeeper scoreKeeper = new ScoreKeeper("A", "B");
        scoreKeeper.reactToGoal("B");
        assertThat(scoreKeeper.getReaction(), is("Team A: 0, Team B: 1"));
    }

}