/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Scene;

/**
 *
 * @author Dragon's
 */

//assignment 9 - implement map
public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map (5, 7);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocation(map, scenes);
        
        return map;
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocation(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
