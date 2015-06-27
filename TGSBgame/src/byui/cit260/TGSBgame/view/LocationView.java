/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

import byui.cit260.TGSBgame.control.LocationControl;
import byui.cit260.TGSBgame.model.Map;

/**
 *
 * @author Adriana
 * Display the following locations description
 */
public class LocationView {

    private final LocationControl locationControl;

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
        }
        else if (location == 3) {
            System.out.println(CENTRALPARK);
        }
        else if (location == 4) {
            System.out.println(SUBWAY);
        }
        else if (location == 5) {
            System.out.println(CHINATOWN);
        }
        else if (location >= 6 || location <= 35) {
            System.out.println("Location is" + location);
        } else {
            System.out.println("\n*** You're out of this world! ***");
        }
    }

}
