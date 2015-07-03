/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.exceptions.LocationControlException;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import byui.cit260.TGSBgame.model.Scene;
import java.awt.Point;

/**
 *
 * @author Adriana
 */
public class LocationControl {


    
    
    public static void startLocationControl(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //class variables
    public int location;

    public int getLocation() {
        return location;
    }

    //returns 0 on success, -1 on failure

    public void setLocation(int row, int column) throws LocationControlException {

        int newLocation = (5 * row) - (5 - column);

        if (newLocation < 1 || newLocation > 35) {
            throw new LocationControlException("Can not move actor to location"
                    + " because that location is outside "
                    + " the bounds of the map.");
        } else {
            location = newLocation;

        }

    }
}
