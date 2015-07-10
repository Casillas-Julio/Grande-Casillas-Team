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
 * @author Adriana
 * Help Menu 
Display the following menu:

	O - Overview of game
	M - Explain how moves are made (roll of dice)
	G - Explain map/locations
	F - Explain fruits/attributes
	C - Explain challenges
	R - Return to MAIN MENU

 */
public class HelpMenuView extends View{

    public HelpMenuView() {
        super("\n"
            + "\n--------------------------------------"
            + "\n| Help Menu                          |"
            + "\n--------------------------------------"
            + "\nO - Overview of game"
            + "\nM - Explain how moves are made"
            + "\nG - Explain map/locations"
            + "\nF - Explain fruits/attributes"
            + "\nC - Explain challenges"
            + "\nR - Return to Game Menu"
            + "\n--------------------------------------");
    }

    private final String OVERVIEW = "\n"
            + "\n---------------------------------------"
            + "\n| Overview of the game                |"
            + "\n---------------------------------------"
            + "\nThe Great and Spacious Building is a   "
            + "\ntext based role playing game based on  "
            + "\nthe Lehi’s vision of the Tree of Life.  "
            + "\nThe player has to journey through life "
            + "\nmaking personal choices that will bring"
            + "\nhim/her closer to eternal life, or     "
            + "\ndistance from the Savior. The player   "
            + "\nneeds to have at least one fruit to be "
            + "\nable to enter the last location and win"
            + "\nthe game."
            + "\n---------------------------------------";

    private final String MOVES = "\n"
            + "\n--------------------------------------"
            + "\n| How moves are made                 |"
            + "\n--------------------------------------"
            + "\nThe player will face challenges and at"
            + "\nthe end of them, he/she will be "
            + "\nprompted to contiune the journey. The "
            + "\ngame will place the player randomly in"
            + "\nthe next six places as if the move was"
            + "\nchosen by the rolling of a die.       "
            + "\n--------------------------------------";
    
    private final String MAP = "\n"
            + "\n--------------------------------------"
            + "\n| Map                                |"
            + "\n--------------------------------------"
            + "\nThe location in which the Great and   "
            + "\nSpacious Building game takes place is "
            + "\nrepresented by many cites in New York,"
            + "\nin a 7x5 grid. The grid contains 35   "
            + "\nlocations and scenarios and in each   "
            + "\narea the player will face a challenge."
            + "\n--------------------------------------";
    
    private final String FRUITS = "\n"
            + "\n----------------------------------------"
            + "\n| Fruits                               |"
            + "\n----------------------------------------"
            + "\nThe fruits are counted as points, but   "
            + "\nthey are more than that. They are the   "
            + "\nrepresentation of the fruits of choices "
            + "\nand sacrifices that needs to be done in "
            + "\norder for the player to remain in the   "
            + "\npath for eternal life. The player starts"
            + "\nthe game with 5 fruits of faith and 5 of"
            + "\nof obedience.                           "
            + "\n----------------------------------------";
    
    private final String CHALLENGES = "\n"
            + "\n---------------------------------------"
            + "\n| Challenges                          |"
            + "\n---------------------------------------"
            + "\nEach location requires the player to   "
            + "\nface a challenge. When he/she wins it, "
            + "\nhe/she will get the fruits associated  "
            + "\nwith the challenge, if he/she loses,   "
            + "\nhe/she loses the same amount of fruits."
            + "\n"
            + "\n---------------------------------------";
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'O':// create an Overview of game
                this.console.println(OVERVIEW);
                break;
            case 'M': //Explain how moves are made
                this.console.println(MOVES);
                break;
            case 'G': // Explain map/locations
                this.console.println(MAP);
                break;
            case 'F': // Explain fruits/attributes
                this.console.println(FRUITS);
                break;
            case 'C': // Explain challenges
                this.console.println(CHALLENGES);
                break;
            case 'R': // Return to Game Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        return false;
    }
}
