/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsbgame;

import byui.cit260.TGSBgame.model.Player;

/**
 *
 * @author Dragon's
 */
public class TGSBgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player ();
        
        playerOne.setName("Camila");
        playerOne.setAtributes("Faith");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
