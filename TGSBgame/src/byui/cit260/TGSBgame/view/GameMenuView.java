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
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
            + "\nM - Move to a map location"
            + "\nH - Show Help Menu"
            + "\nP - Print Actor List"
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
                this.console.println(displayMap);
                break;
            case 'M': {
                try {
                    // M - Move to the map location
                    this.moveToMapLocation();
                } catch (LocationControlException | ChallengesControlException | SceneControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'H': // H - Show Help Menu
                this.displayHelpMenu();
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
