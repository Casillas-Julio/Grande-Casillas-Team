/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Player;
import java.io.Serializable;

/**
 *
 * @author Dragon's
 */
public class PlayerControl implements Serializable {
    private static Object playerName;
    
    public static void playerName(Player playerName){
        playerName.setPlayerName();    
    
    }

}
