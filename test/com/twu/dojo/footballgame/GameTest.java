package com.twu.dojo.footballgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by khusbooj on 04/02/15.
 */
public class GameTest {

    public static final String TEAM_WHO_SCORED = "A";
    private Game game;
    private Reporter reporter;
    private Fan fan;

    @Before
    public void setUp() throws Exception {
        game = new Game();
        reporter = mock(Reporter.class);
        fan = mock(Fan.class);
    }

    @Test
    public void shouldConfirmAttendance() {
        game.addAttendee(fan);
        assertTrue(game.getAttendees().contains(fan));
    }
    @Test
    public void shouldNotifyReactionOfFan() {
        game.addAttendee(fan);
        game.notifyAttendees(TEAM_WHO_SCORED);
        verify(fan).reactToGoal("A");
    }

    @Test
    public void shouldNotifyReactionOfReporter() {
        game.addAttendee(reporter);
        game.notifyAttendees("A");
        verify(reporter).reactToGoal("A");
    }

    @Test
    public void shouldNotifyReactionOfAttendees() {
        game.addAttendee(reporter);
        game.addAttendee(fan);
        game.notifyAttendees("A");
        verify(fan).reactToGoal("A");
        verify(reporter).reactToGoal("A");
    }
}
