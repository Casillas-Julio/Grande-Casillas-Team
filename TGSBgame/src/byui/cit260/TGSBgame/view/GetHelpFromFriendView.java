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
 * @author Adriana 
 * Display the following menu:
 *
 * H - Holy Ghost
 * L - Leaders
 * M - Family Member
 * F - Friends
 * P - Prayer
 */
public class GetHelpFromFriendView extends View {
    
    public GetHelpFromFriendView() {
        super("\n"
            + "\n--------------------------------------"
            + "\n| Get Help From Friend Menu          |"
            + "\n--------------------------------------"
            + "\nH - Holy Ghost"
            + "\nL - Leaders"
            + "\nM - Family Member"
            + "\nF - Friends"
            + "\nP - Prayer"
            + "\nR - Return to MAIN MENU"
            + "\n--------------------------------------");
    }
    
    
    private final String HOLYGHOST = "\n"
            + "\n--------------------------------------"
            + "\n| Holy Ghost                         |"
            + "\n--------------------------------------"
            + "\n Many voices in the world compete for  "
            + "\n your attention, and they can easily   "
            + "\n drown out spiritual impressions if you"
            + "\n are not careful."
            + "\n--------------------------------------";
    
    private final String LEADERS = "\n"
            + "\n---------------------------------------"
            + "\n| Leaders                             |"
            + "\n---------------------------------------"
            + "\n Things will work out. Keep trying.     "
            + "\n Be believing. Don't get discouraged.   "
            + "\n Things will work out. Gordon B Hinckley"
            + "\n--------------------------------------";
    
    private final String FAMILY = "\n"
            + "\n----------------------------------------"
            + "\n| Family Members                       |"
            + "\n----------------------------------------"
            + "\n Remember what Elder Dallin H. Oaks said:"
            + "\n “We have to forego some good things in  "
            + "\n order to choose others that are better  "
            + "\n or best because they develop faith in   "
            + "\n THE Lord Jesus Christ and strengthen    "
            + "\n our families.”                          "
            + "\n----------------------------------------";
    
    private final String FRIENDS = "\n"
            + "\n----------------------------------------"
            + "\n| Friends                              |"
            + "\n----------------------------------------"
            + "\n You can be strong and continue to choose"
            + "\n the right if you remember the teachings "
            + "\n of Jesus Christ and seek the guidance   "
            + "\n from the Holy Ghost.                    "
            + "\n----------------------------------------";
    
    private final String PRAYER = "\n"
            + "\n------------------------------------------"
            + "\n| Prayer                                 |"
            + "\n------------------------------------------"
            + "\n You should pray in accord with the will   "
            + "\n of Heavenly Father. He wants to test you, "
            + "\n to strengthen you, and to help you achieve"
            + "\n your full potential.                      "
            + "\n------------------------------------------";

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        value = value.toUpperCase();
        char choice = value.charAt(0);
        boolean addHelpFruit = true;

        switch (choice) {
            case 'H':// H - Holy Ghost
                this.console.println(HOLYGHOST);
                break;
            case 'L': //L - Leaders
                this.console.println(LEADERS);
                break;
            case 'M': // M - Family Member
                this.console.println(FAMILY);
                break;
            case 'F': // F - Friends
                this.console.println(FRIENDS);
                break;
            case 'P': // P - Prayer
                this.console.println(PRAYER);
                break;
            case 'R': // Return to MAIN MENU
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        if (addHelpFruit == true) {
            int helpFruits;

            helpFruits = GameControl.helpFruits(TGSBgame.getPlayer());
            
            this.console.println("\nYou earned " + helpFruits + " extra fruits for getting"
                    + "\n help from a friend in times of trial and temptation!");
     
        }

        return true;
    }
}