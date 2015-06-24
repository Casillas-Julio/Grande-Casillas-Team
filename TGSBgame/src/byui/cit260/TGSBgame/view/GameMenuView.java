/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;
import byui.cit260.TGSBgame.control.GameControl;
import byui.cit260.TGSBgame.control.LocationControl;
import tgsbgame.TGSBgame;
import java.util.Scanner;

/**
 *
 * @author Dragon
 */
public class GameMenuView extends View{
    
    public GameMenuView() {
        super("\n"
            + "\n--------------------------------------"
            + "\n|            Game Menu               |"
            + "\n--------------------------------------"
            + "\nM - Move to a map location"
            + "\nR - Return to Main Menu"
            + "\nH - Show Help Menu"
            + "\nD - Display Map"
            + "\n--------------------------------------");
    }    
    
    private final String displayMap = "\n"
            + "\n--------------------------------------"
            + "\n|                Map                 |"
            + "\n--------------------------------------"
            + "\n        1     2     3     4     5     "
            + "\n      _____ _____ _____ _____ _____   "
            + "\n   1 |_____|_____|_____|_____|_____|  "
            + "\n   2 |_____|_____|_____|_____|_____|  "
            + "\n   3 |_____|_____|_____|_____|_____|  "
            + "\n   4 |_____|_____|_____|_____|_____|  "
            + "\n   5 |_____|_____|_____|_____|_____|  "
            + "\n   6 |_____|_____|_____|_____|_____|  "
            + "\n   7 |_____|_____|_____|_____|_____|  "
            + "\n                                      "
            + "\n--------------------------------------";
    
    @Override  
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'M':// M - Move to the map location 
                this.startLocationControl();
                break;
            case 'R': //R - Return to the Main Menu
                this.startNewGame();
                break;
            case 'H': // H - Show Help Menu
                this.displayHelpMenu();
                break;
            case 'D': // D - Display Map
                System.out.println(displayMap);
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        return true;
    }
    
     private void startLocationControl() {
        //move to the map location 
        LocationControl.startLocationControl(TGSBgame.getLocation());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();        
    }
     
     private void startNewGame() {
        //create a new game
        GameControl.startNewGame(TGSBgame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();        
    }
     
    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();
    }
}
