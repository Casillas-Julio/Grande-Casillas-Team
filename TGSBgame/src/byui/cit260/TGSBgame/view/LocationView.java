/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

import byui.cit260.TGSBgame.control.LocationControl;
import byui.cit260.TGSBgame.exceptions.LocationControlException;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Scene;

/**
 *
 * @author Adriana
 * Display the following locations description
 */
public class LocationView {

    private final LocationControl locationControl;
    private Object console;

    public LocationView() {

        locationControl = new LocationControl();
    }

    public void display(Map map) throws LocationControlException {
        int location;

        // get location
        try {
            locationControl.setLocation(map.getRowCount(), map.getColumnCount());
        } catch (LocationControlException le) {
            System.out.println(le.getMessage());
        }
        location = locationControl.getLocation();
        // display description for location
        for (Scene s : Scene.values()) {
            if (s.ordinal() == location) {
                System.out.println(s.toString());
            }
        }
    }
}
