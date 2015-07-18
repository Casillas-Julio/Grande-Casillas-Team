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
            + "\nMany voices in the world compete for  "
            + "\nyour attention, and they can easily   "
            + "\ndrown out spiritual impressions if you"
            + "\nare not careful."
            + "\n--------------------------------------";
    
    private final String LEADERS = "\n"
            + "\n---------------------------------------"
            + "\n| Leaders                             |"
            + "\n---------------------------------------"
            + "\nThings will work out. Keep trying.     "
            + "\nBe believing. Don't get discouraged.   "
            + "\nThings will work out. Gordon B Hinckley"
            + "\n--------------------------------------";
    
    private final String FAMILY = "\n"
            + "\n----------------------------------------"
            + "\n| Family Members                       |"
            + "\n----------------------------------------"
            + "\nRemember what Elder Dallin H. Oaks said:"
            + "\n“We have to forego some good things in  "
            + "\norder to choose others that are better  "
            + "\nor best because they develop faith in   "
            + "\nTHE Lord Jesus Christ and strengthen    "
            + "\nour families.”                          "
            + "\n----------------------------------------";
    
    private final String FRIENDS = "\n"
            + "\n----------------------------------------"
            + "\n| Friends                              |"
            + "\n----------------------------------------"
            + "\nYou can be strong and continue to choose"
            + "\nthe right if you remember the teachings "
            + "\nof Jesus Christ and seek the guidance   "
            + "\nfrom the Holy Ghost.                    "
            + "\n----------------------------------------";
    
    private final String PRAYER = "\n"
            + "\n------------------------------------------"
            + "\n| Prayer                                 |"
            + "\n------------------------------------------"
            + "\nYou should pray in accord with the will   "
            + "\nof Heavenly Father. He wants to test you, "
            + "\nto strengthen you, and to help you achieve"
            + "\nyour full potential.                      "
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
            this.console.println("You earned 2 extra fruits for getting"
                    + "\nhelp from a friend in times of trial "
                    + "\nand temptation!");
        }

        return true;
    }
}