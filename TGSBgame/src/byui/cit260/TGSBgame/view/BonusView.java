/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

/**
 *
 * @author Adriana
 */
public class BonusView {
    
    public void bonusView (){
    
    }
    
    public void displayMessage(int bonus) {
        if (bonus > 0) {
            System.out.println("\n**************************************************"
                    + "\n* For your obedience and correct choices, you  *"
                    + "\n* received 2 bonus fruits of spiritual strength.*"
                    + "\n************************************************");
        }
    }

}
