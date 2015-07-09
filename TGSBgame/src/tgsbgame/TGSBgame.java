/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsbgame;

import byui.cit260.TGSBgame.control.ChallengesControl;
import byui.cit260.TGSBgame.exceptions.ProgramControlException;
import byui.cit260.TGSBgame.model.*;
import byui.cit260.TGSBgame.view.MainMenuView;
import byui.cit260.TGSBgame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragon's
 */
public class TGSBgame {

    public static Game currentGame = null;
    public static Player player = null;
    public static Challenges challenges = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
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
        //this.console.println(challengeOne.getChallenge(6));
        StartProgramView startProgramView = new StartProgramView();
        try {
            startProgramView.startProgram();
        } catch (ProgramControlException ex) {
            Logger.getLogger(TGSBgame.class.getName()).log(Level.SEVERE, null, ex);
        }

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
        try {
        // open character string files for end user input and output
        TGSBgame.inFile = new BufferedReader(new InputStreamReader(System.in));
        TGSBgame.outFile = new PrintWriter(this.console, true);
        
        //create StartProgramView and start the program
        //StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        }
        
        catch (Throwable e) {
        
        this.console.println("Exception: " + e.toString()+
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
        
        e.printStackTrace();
        }
        finally {
            try {
                if (TGSBgame.inFile != null);
                    TGSBgame.inFile.close();
                    
                if (TGSBgame.outFile != null);    
                    TGSBgame.outFile.close();
                    
                    if (TGSBgame.logFile != null);    
                    TGSBgame.logFile.close();
                    
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
        try {
        //open logFile
        String filePath = "log.txt";
        TGSBgame.logFile = new PrintWriter(filePath);
        }
        catch (Exception e) {
        this.console.println("Exception: " + e.toString()+
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
        
        e.printStackTrace();
        }
        
    }

    public static Player getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TGSBgame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TGSBgame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TGSBgame.logFile = logFile;
    }
    
}