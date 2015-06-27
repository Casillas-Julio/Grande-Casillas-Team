/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import java.io.Serializable;

/**
 *
 * @author Adriana
 */
public enum Actor implements Serializable{
    
    John_Worth("He's a recent New York resident, and is excited about sharing his discovery of the Big Apple."),
    Simon_Kwan("Kwan is a Chinese-American New Yorker used to life in the big city and its sub-cultures."),
    Kevin_Doom("Kevin is a trendy New York who brags about all this city has to offer. Manhathan is his crib."),
    Mandi_Baxter("Mandi is a fashionista who is always on top of what's happening in her city."),
    Harper_Young("She's a publicist, closely connected with everyone who is important in NY."),
    Angel_Hernandez("Angel know this city inside-out. From the famous avenues to the darkest alley. He has been in all of them.");
    
    
    private final String description;
    private final String challenge;
    
    Actor(String description) {
        this.description = description;
        String challenge1 = this.getChallenge(); 
        
    }
        
    public String getDescription() {
        return description;
    }
    
    public String getChallenge() {
        return challenge;
    }
}
