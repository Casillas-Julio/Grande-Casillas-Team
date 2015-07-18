/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

import byui.cit260.TGSBgame.model.*;
import byui.cit260.TGSBgame.control.ProgramControl;
import byui.cit260.TGSBgame.exceptions.ProgramControlException;
import java.io.IOException;

/**
 *   startProgram(): void 
 *
 * @author Dragon's
 */

public class StartProgramView extends View{
    
//  BEGIN
//      Display the banner screen
//      Get the player name
//      Create a new player
//      Display a customized welcome message
//      Display the main menu
//  END
                
    public StartProgramView() {
        super("");
    }
    public void startProgram() throws ProgramControlException, IOException {
        
        //Diplay the banner screen
        this.displayBanner();
        
        //propmpt the player to input the name
        String playerName = this.getPlayerName();
        
        //Create and save the player object
        Player player = ProgramControl.createPlayer(playerName);
                
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main menu
        //MainMenuView mainMenuView = new MainMenuView();
        //MainMenuView.display();
    }

    private void displayBanner() {
        System.out.println("\n************************************************"
                         + "\n* This is THE GREAT AND SPACIOUS BUILDING game.*"
                         + "\n* This game is an example of what we face in   *"
                         + "\n* life. In this trip to New York, where your   *"
                         + "\n* goal is to reach the temple, and renew your  *"
                         + "\n* convenants with the Lord.                    *"  
                         + "\n*                                              *"
                         + "\n* You want to stay in the narrow path, and you *"
                         + "\n* constantly strive to hold the Iron rod.      *"
                         + "\n* During this mortal life we face many         *"
                         + "\n* challenges, specially from the people in the *"
                         + "\n* great and spacious building. In this game    *"
                         + "\n* these people are all around you. Their goal  *"
                         + "\n* is to take you away from the path that leads *"
                         + "\n* to eternal life. We hope that your choices   *"
                         + "\n* will continue to lead you towards the Tree   *"
                         + "\n* of Life, and that you will be happy forever. *"
                         + "\n*                                              *"
                         + "\n* Enjoy you trip to New York. Good Luck.       *"
                         + "\n************************************************");
        }

    private String getPlayerName() throws IOException, ProgramControlException {
        boolean valid= false; //indicate if the name has be retrived
        String playerName = null; //new String("");
                
        while(!valid) {//while a valid name has not be retreived
            
            // prompt for the player's name
            System.out.println("What's your name?");
            
            //get the name from the keyboard
            playerName = this.keyboard.readLine();
            if (playerName == null) {
                throw new ProgramControlException("Missing Player name");
            }
            playerName = playerName.trim();
            
            //If player name is invalid (less than two characters in length)
            if (playerName.length() <2) {
                System.out.println("Come on, tell me your name for real.");
                continue; //and repeat again 
                
            }
            break; //out of (exit) the repetition
            
        }
        return playerName; // Return Name
    }
    
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n===============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tEnjoy the game!");
        System.out.println("===============================================");
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported/not required"); 
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported/not required"); 
    }
    
}
