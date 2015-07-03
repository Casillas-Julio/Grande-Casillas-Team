/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;
import byui.cit260.TGSBgame.control.GameControl;
import tgsbgame.TGSBgame;

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
            + "\nD - Display Map"
            + "\nM - Move to a map location"
            + "\nH - Show Help Menu"
            + "\nR - Return to Main Menu"
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
            
            case 'D': // D - Display Map
                System.out.println(displayMap);
                break;
            case 'M':// M - Move to the map location 
                this.startLocationControl();
                break;
            case 'H': // H - Show Help Menu
                this.displayHelpMenu();
                break;
            case 'R': //R - Return to the Main Menu
                this.startNewGame();
                break;            
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        return true;
    }
    
    public int getIntNumber() {
        Integer number = null;

        while (number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (value.equals("Q")) {
                break;
            }

            try {
                //parse and convertnumber from text to a int
                number = Integer.parseInt(value);
            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a valid number."
                        + " Try again to enter a number between 1"
                        + " to 3 or enter Q to quit.");
            }
        }

        return number;

    }

    private void startLocationControl() {

        System.out.println("\nEnter a number of spaces between 1"
                + " and 3 to move forward.");
        
        getIntNumber();
        
        
                        
        //move to the map location 
        /* TODO
        1. Move forward 1, 2, or 3
        2. Set map location to new value.  Need to make sure don't pass
           end of row.
        3. set location to new value using row/column
        */
        /*LocationControl.startLocationControl(TGSBgame.getLocation());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();*/
    }
     
     private void startNewGame() {
        //create a new game
        GameControl.createNewGame(TGSBgame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();        
    }
     
    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();
    }
}
