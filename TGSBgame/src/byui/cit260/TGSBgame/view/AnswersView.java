/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;
import byui.cit260.TGSBgame.control.GameControl;
import tgsbgame.TGSBgame;
import byui.cit260.TGSBgame.view.GetHelpFromFriendView;

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
                + "\nY - Yes                               "
                + "\nN - No                                "
                + "\nG - Get Help from friend              "
                + "\nR - I agree with you.                 "
                + "\nW - You are Wrong!                    "
                + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        int bonusPoints = 0;

        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'Y':// Y - Yes Please
                this.console.println("Yes");
                bonusPoints = GameControl.calculateTotalScore(TGSBgame.getPlayer(), -2);
                System.out.println("I'm sorry you were not able to overcome"
                               + "\nthis temptation and you lose 2 fruits.");
                break;
            case 'N': //N - No thanks
                this.console.println("No");
                bonusPoints = GameControl.calculateTotalScore(TGSBgame.getPlayer(), 2);
                System.out.println("Congratulations! You overcame this challenge"
                        + "\nand won 2 fruits");
                break;
            case 'G': // G - Get help from a friend
                this.displayGetHelpFromFriend();
                break;
            case 'R': // R - You are right
                this.console.println("I agree with you");
                bonusPoints = GameControl.calculateTotalScore(TGSBgame.getPlayer(), -2);
                System.out.println("I'm sorry you were not able to overcome"
                               + "\nthis temptation and you lose 2 fruits.");
                break;
            case 'W': // W - You are wrong
                this.console.println("You are wrong");
                bonusPoints = GameControl.calculateTotalScore(TGSBgame.getPlayer(), 2);
                System.out.println("Congratulations! You overcame this challenge"
                        + "\nand won 2 fruits");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }

        if (bonusPoints > 0) {
            System.out.println("\n**************************************************"
                    + "\n* For your obedience and correct choices, you   *"
                    + "\n* received " + bonusPoints + " bonus fruits of spiritual strength.*"
                    + "\n*************************************************");
        }
        return true;
    }
    private void displayGetHelpFromFriend() {
        GetHelpFromFriendView answerMenu = new GetHelpFromFriendView();
        answerMenu.display();
    }
}