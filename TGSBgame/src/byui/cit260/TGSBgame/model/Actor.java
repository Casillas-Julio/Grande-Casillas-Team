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
    
    John_Worth("John Worth is a recent New York resident, and is excited about sharing his discovery of the Big Apple."),
    Simon_Kwan("Simon Kwan is a Chinese-American New Yorker used to life in the big city and its sub-cultures."),
    Kevin_Doom("Kevin Doom is a trendy New York who brags about all this city has to offer. Manhathan is his crib."),
    Mandi_Baxter("Mandi Baxter is a fashionista who is always on top of what's happening in her city."),
    Harper_Young("Harper Young is a publicist, closely connected with everyone who is important in NY."),
    Angel_Hernandez("Angel Hernandez knows this city inside-out. From the famous avenues to the darkest alley. He has been in all of them.");
    
    private final String description;
    
    Actor(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }

    public Point getCoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}