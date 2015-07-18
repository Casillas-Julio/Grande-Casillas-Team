/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.exceptions.ChallengesControlException;
import byui.cit260.TGSBgame.exceptions.LocationControlException;
import byui.cit260.TGSBgame.exceptions.SceneControlException;
import byui.cit260.TGSBgame.model.Game;
import byui.cit260.TGSBgame.model.Location;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Scene;
import tgsbgame.TGSBgame;

/**
 *
 * @author Adriana
 */
public class LocationControl {

    public static void startLocationControl(int spaces) throws LocationControlException, ChallengesControlException, SceneControlException {
        Location locationObj;

        moveToNextLocation(spaces);
        locationObj = MapControl.getLocationFromMap(location);
        doLocationAction(locationObj);
    }

    //class variables
    public static int location;

    public static int getLocation() {
        return location;
    }

    //returns 0 on success, -1 on failure
    //function overload of setLocation
    public static void setLocation(int position) throws LocationControlException{
        Game game = TGSBgame.getCurrentGame();
        Map map = game.getMap();
        int limit = map.getColumnCount() * map.getRowCount();


        if (position < 0 || position >= limit) {
            throw new LocationControlException("Can not move actor to location"
                    + " because that location is outside "
                    + " the bounds of the map.");
        } else {
            location = position;
        }
    }
    private static void moveToNextLocation(int spaces) throws LocationControlException {
        Game game = TGSBgame.getCurrentGame();
        Map map = game.getMap();
        int limit = map.getColumnCount() * map.getRowCount();
        int newLocation = location + spaces;

        if (newLocation >= limit) {
            throw new LocationControlException("Can not move actor to location"
                    + " because that location is outside "
                    + " the bounds of the map.");
        } else {
            location = newLocation;

        }
    }

    private static void doLocationAction(Location location) throws ChallengesControlException, SceneControlException {
        String challengeString;

        // show description of scene for this location
        System.out.println(location.getScene());

        // get random actor for this location
        System.out.println(SceneControl.getActor());

        // get random challenge for this location
        challengeString = ChallengesControl.getChallenge(location.getLinearLocation());
        System.out.println(challengeString);

    }

}