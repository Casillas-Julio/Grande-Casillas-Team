/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;
import byui.cit260.TGSBgame.control.GameControl;
import tgsbgame.TGSBgame;
import java.util.Scanner;
/**
 *
 * @author Dragon's
 */
public class MainMenuView {
//  BEGIN
//    DO
    //      Display the Main Menu
    //      Get the player's selection
    //      Perform action associated with selection
//    WHILE the letter "E" for exit has not been selected
//  END
    
    private final String MENU = "\n"
            + "\n--------------------------------------"
            + "\n| Main Menu                          |"
            + "\n--------------------------------------"
            + "\nG - Start game"
            + "\nH - Show Help menu"
            + "\nS - Save game"
            + "\nE - Exit game"
            + "\n--------------------------------------";
        
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);//display the main menu
            
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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
    }
    
    private void startNewGame() {
        //create a new game
        GameControl.startNewGame(TGSBgame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();        
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.displayMenu();
    }
}
