/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

/**
 *
 * @author Adriana
 */
public class LocationControl {
    
    //class variables
    public int location;

    public int location(int row, int column){
        
        if (row >= 1 && column >= 1){
            if (row <= 5 & column <= 7){
                location = (5 * row)-(5 - column);
                return location;
            }
            else {
                return -1; 
            }
        } 
        return 0;
    
    }
}