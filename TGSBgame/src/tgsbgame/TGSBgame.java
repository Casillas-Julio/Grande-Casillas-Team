/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsbgame;

import byui.cit260.TGSBgame.control.ChallengesControl;
import byui.cit260.TGSBgame.model.*;
import byui.cit260.TGSBgame.view.MainMenuView;
import byui.cit260.TGSBgame.view.StartProgramView;

/**
 *
 * @author Dragon's
 */
public class TGSBgame {

    private static Game currentGame = null;
    public static Player player = null;
    public static Challenges challenges = null;

    public static Challenges getChallenges() {
        return challenges;
    }

    public static void setChallenges(Challenges challenges) {
        TGSBgame.challenges = challenges;
    }
    
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
        //ChallengesControl challengeOne = new ChallengesControl(35);
        //System.out.println(challengeOne.getChallenge(6));
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
    }

    public static Player getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}