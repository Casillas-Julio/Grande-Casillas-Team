/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Challenges;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import java.io.Serializable;
import static tgsbgame.TGSBgame.player;
import byui.cit260.TGSBgame.model.Actor;


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
        
        if ((score >= 20) &&(player.isBonus20() == false)){
            bonus = (int)(score * 0.2);
            player.setBonus20(true);// flag that the player already got the  20 bonus once
        }
        else if ((score >= 40)&&(player.isBonus40() == false)){
            bonus = (int)(score * 0.25);
            player.setBonus40(true);
        }
        else if ((score >= 60)&&(player.isBonus60() == false)){
            bonus = (int)(score * 0.3);
            player.setBonus60(true);
        }
        return bonus;
        }
        
        public class GameControl {
            public static void createNewGame(Player player) {
                System.out.println("***createNewGame in GameControl called ***");
            
            Game game =new Game (); // create new game
            TGSBGame.setCurrentGame(game); // save in TGSBGame
            
            game.detPlayer(player); //save player in game
            
            Challenges[] challengesList = GameControl.createChallenges();
            game.setChallenges(Challenges);
            
            Map map = MapControl.createMap(); //create nd initialize new map
            game.setMap(map); //save map in game
            
            MapControl.moveActorsToStartingLocation(map); //move actors to starting position
        }
            
        public class Game implements Serializable {
            private Player player;
            private Challenges[] inventory;
            private Map map;
        }
        
        }
    }
}
