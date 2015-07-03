/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Actor;
import byui.cit260.TGSBgame.model.Location;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Scene;
import byui.cit260.TGSBgame.model.Scene;
import java.awt.Point;
import tgsbgame.TGSBgame;

/**
 *
 * @author Dragon's
 */

//assignment 9 - implement map
public class MapControl {
    
    public static Map createMap() {
        //create the map
        Map map = new Map(7, 5);

        //create the scenes for the game
        //Scene[] scenes = createScenes();

        //assign scenes to locations
        assignScenesToLocations(map);

        return map;
    }
    
    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(Scene.JFK_Airport);
        locations[0][1].setScene(Scene.Time_Square);
        locations[0][2].setScene(Scene.Central_Park);
        locations[0][3].setScene(Scene.NY_Subway);
        locations[0][4].setScene(Scene.Chinatown);
        locations[1][0].setScene(Scene.Little_Italy);
        locations[1][1].setScene(Scene.Metropolitan_Museum_of_Art);
        locations[1][2].setScene(Scene.Broadway);
        locations[1][3].setScene(Scene.Lincoln_Center);
        locations[1][4].setScene(Scene.Grand_Central_Station);
        locations[2][0].setScene(Scene.Statue_of_Liberty);
        locations[2][1].setScene(Scene.Hudson_River);
        locations[2][2].setScene(Scene.Chelsea_Market);
        locations[2][3].setScene(Scene.Brooklyn_Bridge);
        locations[2][4].setScene(Scene.Soho);
        locations[3][0].setScene(Scene.Empire_State_Building);
        locations[3][1].setScene(Scene.Rockefeller_Center);
        locations[3][2].setScene(Scene.Ellis_Island);
        locations[3][3].setScene(Scene.New_York_Public_Library);
        locations[3][4].setScene(Scene.Fifth_Avenue);
        locations[4][0].setScene(Scene.Gothan_West_Market);
        locations[4][1].setScene(Scene.Washignton_Square_Park);
        locations[4][2].setScene(Scene.Flatiron_Building);
        locations[4][3].setScene(Scene.Wall_Street);
        locations[4][4].setScene(Scene.Queensbridge_Park_Queens);
        locations[5][0].setScene(Scene.Music_Hall_of_Williamsburg_Brooklyn);
        locations[5][1].setScene(Scene.Carlos_Bakery_New_Jersey);
        locations[6][0].setScene(Scene.Radio_City_Music_Hall);
        locations[5][2].setScene(Scene.The_Cathedral_Church_of_St_John_the_Divine);
        locations[5][3].setScene(Scene.United_Nation_Headquarters);
        locations[5][4].setScene(Scene.Unisphere_Queens);
        locations[6][1].setScene(Scene.Yankee_Stadium_Bronx);
        locations[6][2].setScene(Scene.Nine_Eleven_Museum);
        locations[6][3].setScene(Scene.High_Line);
        //end point
        locations[6][4].setScene(Scene.Manhatan_Temple);
    }
    

       
    }
 

