/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Adriana
 */
//assignment 9 - implement and populate an enum list
public enum Actor implements Serializable{
    
    John_Worth("\n"
            + "\n-------------------------------------------------------"
            + "\n| John Worth is a recent New York resident, and is     "
            + "\n| excited about sharing his discovery of the Big Apple."
            + "\n-------------------------------------------------------"),
            
    Simon_Kwan("\n"
            + "\n------------------------------------------------------"
            + "\n| Simon Kwan is a Chinese-American New Yorker used to "
            + "\n| life in the big city and its sub-cultures.          "
            + "\n------------------------------------------------------"),
    
    Kevin_Doom("\n"
            + "\n------------------------------------------------------"
            + "\n| Kevin Doom is a trendy New York who brags about all "
            + "\n| this city has to offer. Manhathan is his crib.      "
            + "\n------------------------------------------------------"),
    
    Mandi_Baxter("\n"
            + "\n------------------------------------------------------"
            + "\n| Mandi Baxter is a fashionista who is always on top  "
            + "\n| of what's happening in her city.                    "
            + "\n------------------------------------------------------"),
    
    Harper_Young("\n"
            + "\n------------------------------------------------------"
            + "\n| Harper Young is a publicist, closely connected with "
            + "\n| everyone who is important in NY.                    "
            + "\n------------------------------------------------------"),
    
    Angel_Hernandez("\n"
            + "\n------------------------------------------------------"
            + "\n| Angel Hernandez knows this city inside-out. From the"
            + "\n| famous avenues to the darkest alley. He has been in "
            + "\n| all of them.                                        "
            + "\n------------------------------------------------------");   
    
    private final String description;
    
    Actor(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }

    /*public Point getCoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
}