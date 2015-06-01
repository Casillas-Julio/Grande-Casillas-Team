/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import java.io.Serializable;

/**
 *
 * @author Dragon's
 */
public class PlayerControl implements Serializable {
    
    public static void name(Player name){
        name.setName();    
    
    }
    
    public static void attribute(Player attribute){
        attribute.setAttribute();
    
    }
}
