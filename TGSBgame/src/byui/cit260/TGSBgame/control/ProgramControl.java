/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Player;
import tgsbgame.TGSBgame;

/**
 *
 * @author Dragon's
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
    
        if (name==null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        TGSBgame.setPlayer(player); //save the player
        
        return player;
        
    }
    
}
