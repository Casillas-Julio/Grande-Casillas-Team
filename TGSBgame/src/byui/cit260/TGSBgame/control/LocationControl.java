/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

/**
 *
 * @author Adriana
 */
public class LocationControl {

    //class variables
    private int location;

    public int getLocation() {
        return location;
    }
    //returns 0 on success, -1 on failure
    public int setLocation(int row, int column) {

        int newLocation = (5 * row) - (5 - column);

        if (newLocation < 1 || newLocation > 35) {
            return -1;
        } else {
            location = newLocation;
            return 0;
        }
    }
}
