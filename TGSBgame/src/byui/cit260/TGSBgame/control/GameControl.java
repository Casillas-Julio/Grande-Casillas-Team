/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import static byui.cit260.TGSBgame.control.BonusControl.calculateBonus;
import byui.cit260.TGSBgame.model.Challenges;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import java.io.Serializable;
import static tgsbgame.TGSBgame.player;
import byui.cit260.TGSBgame.model.Actor;
import tgsbgame.TGSBgame;


/**
 *
 * @author Adriana
 */
public class GameControl implements Serializable{
    
    private Player player;
    private Challenges[] inventory;
    private Map map;
        
    /**
     *
     * @param player
     */
    public static void starNewGame(Player player){
        player.setFruits(10);
//        
        Game game = new Game(); // create new game
        
        TGSBgame.setCurrentGame(game); // save in TGSBGame

        game.setPlayer(player); //save player in game

        Challenges[] challengesList = GameControl.createChallenges();
        game.setChallenges(Challenges);

        Map map = MapControl.createMap(); //create nd initialize new map
        game.setMap(map); //save map in game

        MapControl.moveActorsToStartingLocation(map); //move actors to starting position
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
    
}