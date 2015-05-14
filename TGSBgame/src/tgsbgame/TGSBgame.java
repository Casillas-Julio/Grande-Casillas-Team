/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsbgame;

import byui.cit260.TGSBgame.model.*;

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
        
        Item itemOne = new Item ();
        
        itemOne.setRequiredAmount(2);
        itemOne.setQuantityInStock(15);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        Actor actorOne = new Actor ();
        
        actorOne.setType("Friend");
                
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Enemy enemyOne = new Enemy ();
        
        enemyOne.setName("Izabel");
        enemyOne.setRow(4);
        enemyOne.setColumn(6);
        enemyOne.setEnemyNo(2);
        
        String enemyInfo = enemyOne.toString();
        System.out.println(enemyInfo);
        
        Friend friendOne = new Friend();
        
        friendOne.setName("Mary");
        friendOne.setRow(4);
        friendOne.setColumn(5);
        friendOne.setFriendNo(3);
        
        String friendInfo = friendOne.toString();
        System.out.println(friendInfo);
              
    }
    
}
