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
//        Player playerOne = new Player ();
//        
//        playerOne.setName("Camila");
//        GameControl.startNewGame(playerOne);
//        
//        String playerInfo = playerOne.toString();
//        System.out.println(playerInfo);
//        
//        Item itemOne = new Item ();
//        
//        itemOne.setRequiredAmount(2);
//        itemOne.setQuantityInStock(15);
//        
//        String itemInfo = itemOne.toString();
//        System.out.println(itemInfo);
//        
//        Actor actorOne = new Actor ();
//        
//        actorOne.setType("Friend");
//                
//        String actorInfo = actorOne.toString();
//        System.out.println(actorInfo);
//        
//        Enemy enemyOne = new Enemy ();
//        
//        enemyOne.setName("Izabel");
//        enemyOne.setRow(4);
//        enemyOne.setColumn(6);
//        enemyOne.setEnemyNo(2);
//        
//        String enemyInfo = enemyOne.toString();
//        System.out.println(enemyInfo);
//        
//        Friend friendOne = new Friend();
//        
//        friendOne.setName("Mary");
//        friendOne.setRow(4);
//        friendOne.setColumn(5);
//        friendOne.setFriendNo(3);
//        
//        String friendInfo = friendOne.toString();
//        System.out.println(friendInfo);
        
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
        mapOne = new Map(1,5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
                
        LocationView locationView = new LocationView();
        locationView.display(mapOne);
        
        Location locationOne = new Location(1,2);
                
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
//        Game gameOne = new Game();
//        
//        gameOne.setPlayer("Camila");
//        gameOne.setActors(3);
//        gameOne.setAttribute("faith");
//        
//        String gameInfo = gameOne.toString();
//        System.out.println(gameInfo);
        
        Challenges challengesX = new Challenges();
        
        challengesX.setType("Doubt");
        challengesX.setAmmount(4);
        
        String challengesInfo = challengesX.toString();
        System.out.println(challengesInfo);
        
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

    
}
