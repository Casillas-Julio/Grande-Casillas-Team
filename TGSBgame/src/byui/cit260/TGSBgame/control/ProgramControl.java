/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;



import byui.cit260.TGSBgame.model.Player;
import tgsbgame.TGSBgame;
import byui.cit260.TGSBgame.exceptions.ProgramControlException;
/**
 *
 * @author Dragon's
 */
public class ProgramControl {

    public static Player createPlayer(String name) throws ProgramControlException {

        if (name == null) {
            throw new ProgramControlException("Can not create a player with null name string");
        }

        Player player = new Player();
        player.setName(name);

        TGSBgame.setPlayer(player); //save the player

        return player;

    }

}
