/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import java.io.Serializable;
import static tgsbgame.TGSBgame.player;

/**
 *
 * @author Adriana
 */
public class GameControl implements Serializable{
    
    public static void startNewGame(Player player){
        player.setFruits(10);
        System.out.println("\n*** startNewGame stub function called ***");
    
    }
    
    public static void initializeMap(Map map){
        map.setColumnCount(1);
        map.setRowCount(1);
    
    }
    
}
