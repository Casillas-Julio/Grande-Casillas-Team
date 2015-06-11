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
public class GameMenuView {
    
    private final String MENU = "\n"
            + "\n--------------------------------------"
            + "\n|            Game Menu               |"
            + "\n--------------------------------------"
            + "\nM - Move to a map location"
            + "\nR - Return to Main Menu"
            + "\nH - Show Help Menu"
            + "\nD - Display Map"
            + "\n--------------------------------------";
    
    
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
    
    public void displayMenu() {

        char selection = ' ';
        do {

            System.out.println(MENU);//display the get help from friend menu

            String input = this.getInput();// get the user's selection
            selection = input.charAt(0);// get first character of string

            this.doAction(selection);//do action selection

        } while (selection != 'E'); // an selection is not"Exit
    }

    public String getInput() {
        String input;
        Scanner keyboard = new Scanner(System.in); //keyboard input screen

        // prompt for the input from the player selection
        System.out.println("Select your next action from MENU.");

        //get the selection from the keyboard
        input = keyboard.nextLine();
        input = input.trim();
        input = input.toUpperCase();

        return input; // Return Name
    }
    
    public void doAction(char choice) {

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
    }
    
     private void startLocationControl() {
        //move to the map location 
        LocationControl.startLocationControl(TGSBgame.getLocation());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();        
    }
     
     private void startNewGame() {
        //create a new game
        GameControl.startNewGame(TGSBgame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();        
    }
     
    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.displayMenu();
    }
}
