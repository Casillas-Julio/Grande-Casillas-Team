/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsbgame;

import byui.cit260.TGSBgame.exceptions.ProgramControlException;
import byui.cit260.TGSBgame.model.*;
import byui.cit260.TGSBgame.view.MainMenuView;
import byui.cit260.TGSBgame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;

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
    public static Actor actorList = null;

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
        StartProgramView startProgramView;
        //test code
        //ChallengesControl challengeOne = new ChallengesControl(35);
        //this.console.println(challengeOne.getChallenge(6));
        try {
            // open character string files for end user input and output
            TGSBgame.inFile = new BufferedReader(new InputStreamReader(System.in));
            TGSBgame.outFile = new PrintWriter(System.out, true);

            startProgramView = new StartProgramView();
            startProgramView.startProgram();
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();

            //create StartProgramView and start the program
            //StartProgramView startProgramView = new StartProgramView();
            //startProgramView.display();
            return;
        } catch (ProgramControlException | IOException e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());

        } finally {
            try {
                if (TGSBgame.inFile != null) {
                    TGSBgame.inFile.close();
                }

                if (TGSBgame.outFile != null) {
                    TGSBgame.outFile.close();
                }

                if (TGSBgame.logFile != null) {
                    TGSBgame.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            } catch (Exception e) {
                System.out.println("Exception: " + e.toString());
            }
        }

        try {
            //open logFile
            String filePath = "log.txt";
            TGSBgame.logFile = new PrintWriter(filePath);
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        }

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
    private Writer console;

}
