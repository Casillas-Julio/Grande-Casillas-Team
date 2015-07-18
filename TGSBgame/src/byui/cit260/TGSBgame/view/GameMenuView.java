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
import byui.cit260.TGSBgame.model.Actor;
import byui.cit260.TGSBgame.model.Game;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import byui.cit260.TGSBgame.view.AnswersView;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            + "\nM - Move to a new location"
            + "\nH - Show Help Menu"
            + "\nF - Show number of fruits"
            + "\nP - Print Actor List"
            + "\nR - Return to Main Menu"
            + "\n--------------------------------------");   
    }    
    ;
    
    private void displayMap(){
        Game game = TGSBgame.getCurrentGame();
        Map map = game.getMap();
        int location = LocationControl.getLocation();
        int mapLocation;
        
        System.out.println( "\n"
            + "\n----------------------------------"
            + "\n|            Map                 |"
            + "\n----------------------------------"
            + "\n        1    2    3    4    5     ");
        for (int i = 0; i < map.getRowCount(); i++) {
            System.out.print("\n   " + (i + 1) + "  ");
            for (int j = 0; j < map.getColumnCount(); j++) {
                mapLocation = map.getColumnCount() * i + j;
                if (mapLocation == location) {
                    System.out.print("  X  ");
                    
                }
                else {
                    System.out.print("  -  ");
                }
            }
 //           System.out.println();
        }
    }
    
    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        
        Player player = TGSBgame.getPlayer();

        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {

            case 'D': // D - Display Map
                displayMap();
                break;
            case 'M': {
                try {
                    boolean gameOver;

                    // M - Move to a new location
                    this.moveToMapLocation();
                    AnswersView answersView = new AnswersView();
                    //display the answer menu
                    answersView.display();
                    gameOver = GameControl.endOfGame(player, LocationControl.getLocation());
                    if (gameOver == true) {
                        return true;//R - Return to the Main Menu
                    }
                } catch (LocationControlException | ChallengesControlException | SceneControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.INFO,
                            "Choose display map to see where you are!", ex);
                }
            }
            break;
            case 'H': // H - Show Help Menu
                this.displayHelpMenu();
                break;
            case 'F': // H - Show number of fruits
                this.console.println("The numbers of fruits you have is: " + 
                                      player.getFruits());
                break; 
            case 'P': // P - Print Actor list
                String filePath = getFileName();
                this.printActorList(filePath);
                break;
            case 'R': //R - Return to the Main Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        return false;
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

    private void moveToMapLocation() throws LocationControlException, ChallengesControlException, SceneControlException {
        int spaces;

        this.console.println("\nEnter a number of spaces between 1"
                + " and 3 to move forward.");

        spaces = getIntNumber();

        LocationControl.startLocationControl(spaces);

    }
     
    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();
    }
    
    public String getFileName(){
        System.out.println("\n\n Enter the file path for the report "
                            + "to be saved");
        String filePath = this.getInput();
        return filePath;
                 
    }
    
    public void printActorList(String outputLocation) {
        try (PrintWriter out = new PrintWriter(outputLocation)) {

            out.println("\n\n Characters in the Game");
            out.printf("%n%-10s%-20s%-20s", "Number", "Name", "Description");
            out.printf("%n%-10s%-20s%-20s", "------", "----", "-----------");

            for (Actor a : Actor.values()) {
                out.printf("%n%-10s%-20s%-100s",(a.ordinal()+ 1),a.name(),a.toString());
                //System.out.println(a.name());
                //System.out.println(a.toString());
            }
        } catch (IOException ex) {
            System.out.println("I?o Error: " + ex.getMessage());
        }
    }
    
}
