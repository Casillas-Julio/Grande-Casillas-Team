/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;
import byui.cit260.TGSBgame.control.GameControl;
import byui.cit260.TGSBgame.control.LocationControl;
import byui.cit260.TGSBgame.exceptions.ChallengesControlException;
import byui.cit260.TGSBgame.exceptions.LocationControlException;
import byui.cit260.TGSBgame.exceptions.SceneControlException;
import tgsbgame.TGSBgame;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dragon's
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n--------------------------------------"
            + "\n| Main Menu                          |"
            + "\n--------------------------------------"               
            + "\nN - Start Game"
            + "\nG - Start Existing Game"
            + "\nH - Show Help Menu"
            + "\nS - Save Game"
            + "\nE - Exit Game"
            + "\n--------------------------------------");
    }
    
    @Override    
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();// convert to all upper case
        char choice = value.charAt(0);// get first character entered

        switch (choice) {
            case 'N':// create and start a new game
                this.startNewGame();
                break;
            case 'G': //get and start a new game
                this.startExistingGame();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'S': // save current game
                this.saveGame();
                break;
            case 'E': // exit the program
               return true;
                //this.exitGame();
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        return false;    
    }
    
    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(TGSBgame.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        try {
            LocationControl.startLocationControl(0);
        } catch (LocationControlException | ChallengesControlException | SceneControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //display the game menu
        gameMenu.display();        
    }
    
    private void startExistingGame() {
        System.out.println("\n\nEnter the file name for the game "
                            + "to be loaded");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.getStartExistingGame(filePath);
        }
        catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();
    }
    
    private void saveGame() {
        System.out.println("\n\n Enter the file name for the game "
                            + "is to be saved");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(TGSBgame.getCurrentGame(), filePath);
        }
        catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
}
