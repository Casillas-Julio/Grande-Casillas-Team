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
public class AnswersView extends View {

    public AnswersView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n|            Answers Menu            |"
                + "\n--------------------------------------"
                + "\nY - Yes please"
                + "\nN - No thanks"
                + "\nG - Get Help from friend"
                + "\nR - You are Right"
                + "\nW - You are Wrong"
                + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'Y':// Y - Yes Please
                this.console.println("Yes Please");
                break;
            case 'N': //N - No thanks
                this.console.println("No thanks");
                break;
            case 'G': // G - Get help from a friend
                this.console.println("Get help from friend");
                break;
            case 'R': // R - You are right
                this.console.println("You are right");
                break;
            case 'W': // W - You are wrong
                this.console.println("You are wrong");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        return true;
    }
}
