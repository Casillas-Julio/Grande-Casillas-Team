/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

import byui.cit260.TGSBgame.control.LocationControl;
import byui.cit260.TGSBgame.model.Map;
import java.util.Scanner;

/**
 *
 * @author Adriana Display the following locations description
 */
public class LocationView {

    private LocationControl locationControl;

    public LocationView() {

        locationControl = new LocationControl();
    }

    private final String JFK = "\n"
            + "\n--------------------------------------------------"
            + "\n| JFK Airport                                    |"
            + "\n--------------------------------------------------"
            + "\nYou have arrived at the John F Kennedy Airport    "
            + "\n(JFK) is the busiest of New York's three airport. "
            + "\nthree airports There are millions of passengers   "
            + "\nheading to or arriving from domestic and interna- "
            + "\ntional destinations every year here. Today is a   "
            + "\nbeautiful day, and there are many people passing  "
            + "\nby, some in a hurry and some looking for someone  "
            + "\nto who could guide them out of this madness. You  "
            + "\nran to get into one of the AirTrain and is heading"
            + "\nout to your hotel. A person next to you engages in"
            + "\na conversation."
            + "\n--------------------------------------------------";

    private final String TIMESQUARE = "\n"
            + "\n----------------------------------------------------"
            + "\n| Time Square                                      |"
            + "\n----------------------------------------------------"
            + "\nTimes Square displays of lights and digital signs   "
            + "\nis impressive even during the daytime. It is a      "
            + "\nmajor commercial intersection and neighborhood in   "
            + "\nMidtown Manhattan, New York City, at the junction   "
            + "\nof Broadway and Seventh Avenue. There are people    "
            + "\neverywhere, some enjoying the day eating ouside,    "
            + "\nothers are in line to by tickes for tonight's       "
            + "\nshows other's are waiting for the free entertainment"
            + "\nabout to start, and others are just trying to take  "
            + "\nall in as you do. As you watch people passing by, a "
            + "\nperson stops by your side and starts a conversation."
            + "\n----------------------------------------------------";

    private final String CENTRALPARK = "\n"
            + "\n----------------------------------------"
            + "\n| Central Park                         |"
            + "\n----------------------------------------"
            + "\n"
            + "\n----------------------------------------";

    private final String SUBWAY = "\n"
            + "\n----------------------------------------"
            + "\n| NYC Subway                            |"
            + "\n----------------------------------------"
            + "\n"
            + "\n----------------------------------------";

    private final String CHINATOWN = "\n"
            + "\n------------------------------------------"
            + "\n| Chinatown                               |"
            + "\n------------------------------------------"
            + "\n"
            + "\n------------------------------------------";

    private final String TEMPLE = "\n"
            + "\n--------------------------------------"
            + "\n| Manhathan Temple                   |"
            + "\n--------------------------------------"
            + "\n"
            + "\n--------------------------------------";

    public void display(Map map) {
        int location;

        // get location
        locationControl.setLocation(map.getRowCount(), map.getColumnCount());
        location = locationControl.getLocation();
        // display description for location

        if (location == 1) {
            System.out.println(JFK);
        } else if (location == 2) {
            System.out.println(TIMESQUARE);
        } else {
            System.out.println("\n*** You're out of this world! ***");
        }
    }

    //we may not need this

    public int getInput() {
        int location = 0;
        int row;
        int column;

        Scanner loc = new Scanner(System.in); //keyboard input screen

        // prompt for the input from the player selection
        System.out.println("Enter row.");
        row = loc.nextInt();
        System.out.println("Enter column.");
        column = loc.nextInt();

        if (row >= 1 || row <= 35) {
            if (column >= 1 || column <= 35) {
                location = (5 * row) - (5 - column);

            } else {
                return 0;
            }

        } else {
            return 0;
        }

        return location; // Return map position
    }

}
