package com.twu.dojo.footballgame;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReporterTest {

    @Test
    public void testReactToTeamAGoal()  {
        Reporter reporter = new Reporter();
        reporter.reactToGoal("A");
        assertThat(reporter.getReaction(), is("Team A scored"));
    }

    @Test
    public void testReactToTeamBGoal()  {
        Reporter reporter = new Reporter();
        reporter.reactToGoal("B");
        assertThat(reporter.getReaction(), is("Team B scored"));
    }
}