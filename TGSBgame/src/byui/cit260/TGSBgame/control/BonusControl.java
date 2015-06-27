/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Player;

/**
 *
 * @author Adriana
 */
/*WHEN player reaches 20 fruits, he gets X bonus fruits
		40 fruits, he gets Y fruits
		60 fruits he gets, Z fruits
IF he loses fruits, he does not lose the bonus fruits
Bonus fruits are CALCULATED by the number of fruits he has in percentages ( 20%
, 40% and 60%). These values are rounded to a whole number and added to the 
total number of fruits the player has.*/

public class BonusControl {
    
    public static int calculateBonus(Player player){
        int score = player.getFruits();
        int bonus = 0;
        
        if ((score >= 20) &&(player.isBonus20() == false)){
            bonus = (int)(score * 0.2);
            player.setBonus20(true);// flag that the player already got the  20 bonus once
        }
        else if ((score >= 40)&&(player.isBonus40() == false)){
            bonus = (int)(score * 0.25);
            player.setBonus40(true);
        }
        else if ((score >= 60)&&(player.isBonus60() == false)){
            bonus = (int)(score * 0.3);
            player.setBonus60(true);
        }
        return bonus;
        }
}
