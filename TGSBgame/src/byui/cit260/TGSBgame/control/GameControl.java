/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Challenges;
import byui.cit260.TGSBgame.model.Game;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import byui.cit260.TGSBgame.model.Scene;
import java.io.Serializable;
import tgsbgame.TGSBgame;



/**
 *
 * @author Adriana
 */
public class GameControl implements Serializable{



    private Player player;
    private Map map;
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void createNewGame(Player player){
    
        player.setFruits(10);
        
        Game game = new Game(); // create new game
        TGSBgame.setCurrentGame(game); // save in TGSBGame

        //game.setPlayer(player);// save player in game
        
        Challenges challenges = new Challenges();
        TGSBgame.setChallenges(challenges);
        
        Map map = MapControl.createMap(); //create nd initialize new map
        game.setMap(map); //save map in game

    }


    public static void initializeMap(Map map){
        map.setColumnCount(1);
        map.setRowCount(1);
    
    }
    // returns bonus fruits if any were added
    public static int calculateScore(Player player, int fruitsToAdd) {
        int totalScore;
        int bonus;
                
        bonus = calculateBonus(player);
        totalScore = player.getFruits() + fruitsToAdd + bonus;
        player.setFruits(totalScore);
        return bonus;
    }
    

    public static int calculateBonus(Player player){
        int score = player.getFruits();
        int bonus = 0;
        //changed to increment the bonus on each level of points
        if ((score >= 20) && (player.isBonus20() == false)){
            bonus += (int)(score * 0.2);
            player.setBonus20(true);// flag that the player already got the  20 bonus once
        }
        if ((score >= 40) && (player.isBonus40() == false)){
            bonus += (int)(score * 0.25);
            player.setBonus40(true);// flag that the player already got the  40 bonus once
        }
        if ((score >= 60) && (player.isBonus60() == false)){
            bonus += (int)(score * 0.3);
            player.setBonus60(true);// flag that the player already got the  60 bonus once
        }
        return bonus;
    }
    
    public static int helpFruits(Player player) {
        int totalScore;
        final int bonusHelpFruits = 2;
                        
        totalScore = player.getFruits() + bonusHelpFruits;
        player.setFruits(totalScore);
        return bonusHelpFruits;
    }
}    
