/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Adriana
 */
public enum Actor implements Serializable{
    
    John Worth("He's a recent New York resident, and is excited about sharing his discovery of the Big Apple."),
    Simon Kwan("Kwan is a Chinese-American New Yorker used to life in the big city and its sub-cultures."),
    Kevin Doom("Kevin is a trendy New York who brags about all this city has to offer. Manhathan is his crib."),
    Mandi Baxter("Mandi is a fashionista who is always on top of what's happening in her city."),
    Harper Young("She's a publicist, closely connected with everyone who is important in NY."),
    Angel Hernandez("Angel know this city inside-out. From the famous avenues to the darkest alley. He has been in all of them.");
    
    
    private final String description;
    private final String challenge;
    
    Actor(String description) {
        this.description = description;
        challenge = 
    }
        
    public String getDescription() {
        return description;
    }
    
    public String getChallenge() {
        return challenge;
    }
}
