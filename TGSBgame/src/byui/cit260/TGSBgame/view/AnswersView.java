/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;
import java.util.Scanner;

/**
 *
 * @author Dragon's
 */
public class AnswersView {
    
    private final String ANSWERS = "\n"
            + "\n--------------------------------------"
            + "\n|            Answers Menu            |"
            + "\n--------------------------------------"
            + "\nY - Yes please"
            + "\nN - No thanks"
            + "\nG - Get Help from friend"
            + "\nR - You are Right"
            + "\nW - You are Wrong"
            + "\n--------------------------------------";
    
    public void displayMenu() {

        char selection = ' ';
        do {

            System.out.println(ANSWERS);//display the answers menu

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
            case 'Y':// Y - Yes Please
                System.out.println("Yes Please");
                break;
            case 'N': //N - No thanks
                System.out.println("No thanks");
                break;
            case 'G': // G - Get help from a friend
                System.out.println("Get help from friend");
                break;
            case 'R': // R - You are right
                System.out.println("You are right");
                break;
            case 'W': // W - You are wrong
                System.out.println("You are wrong");
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
    }
}
