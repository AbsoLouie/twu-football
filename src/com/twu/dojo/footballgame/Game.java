package com.twu.dojo.footballgame;

import java.util.ArrayList;

/**
 * Created by khusbooj on 04/02/15.
 */
public class Game {
    ArrayList<Attendee> attendees = new ArrayList<Attendee>();

    public void notifyAttendees(String teamWhoScored) {
        for (Attendee attendee : attendees) {
            attendee.reactToGoal(teamWhoScored);
        }
    }

    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
    }

    public ArrayList<Attendee> getAttendees() {
        return attendees;
    }
}
