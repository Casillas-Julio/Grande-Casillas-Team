/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsbgame;

import byui.cit260.TGSBgame.view.StartProgramView;
import byui.cit260.TGSBgame.control.ChallengesControl;
import byui.cit260.TGSBgame.control.GameControl;
import byui.cit260.TGSBgame.model.*;
import byui.cit260.TGSBgame.view.*;

/**
 *
 * @author Dragon's
 */
public class TGSBgame {

    private static Game currentGame = null;
    public static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TGSBgame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TGSBgame.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //test code
        ChallengesControl challengeOne = new ChallengesControl(35);
        System.out.println(challengeOne.getChallenge(6));
        
//        Scene sceneOne = new Scene();
//        
//        sceneOne.setDescription("Follow the personage in red");
//        sceneOne.setSymbol("&");       
//        
//        String sceneInfo = sceneOne.toString();
//        System.out.println(sceneInfo);
        
        Map mapOne;
        Map mapTwo;
        Map mapThree;
        Map mapFour;
        Map mapFive;
        mapOne = new Map(1,3);
        mapTwo = new Map(1,5);
        mapThree = new Map(3,2);
        mapFour = new Map(24,20000);
        mapFive = new Map(-1,0);
        
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
                
        LocationView locationView = new LocationView();
        locationView.display(mapOne);
        
        Location locationOne = new Location(1,2);
                
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
      
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        System.out.println("this is test code for calculating score. "
                + "\nThis can be deleted when full game implemented.");
        
        int bonus;
 
        System.out.println("Add 25 points");
        bonus = GameControl.calculateScore(player, 25);
        if (bonus > 0) {
            BonusView bonusView = new BonusView();
            bonusView.displayMessage(bonus);
        }
        System.out.println("Total score:" + player.getFruits());        
        System.out.println("Add 15 points");
        bonus = GameControl.calculateScore(player, 15);
        if (bonus > 0) {
            BonusView bonusView = new BonusView();
            bonusView.displayMessage(bonus);
        }
        System.out.println("Total score:" + player.getFruits()); 
        
        

    }

    public static Player getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class setCurrentGame {

        public setCurrentGame() {
        }
    }
    
    
}
