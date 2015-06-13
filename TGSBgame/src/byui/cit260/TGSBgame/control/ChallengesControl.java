/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Adriana
 */
public class ChallengesControl implements Serializable{
    
    //class variable
    private static final String[] challenges = 
        {"doubt", "iniquity" ,"addictions", "ignorance", "dishonesty", 
         "deception", "pride", "unemployment", "peer pressure", "sickeness",
         "rebelion", "fear", "greed", "loneliness", "betrayal",
         "power", "poverty", "loss","fun"};
    private int numLocations;
    private Random rand; 

    public ChallengesControl(int numLocations) {
        rand = new Random(System.currentTimeMillis());
        this.numLocations = numLocations;
    }

    public ChallengesControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getChallenge(int location){
        int whichEntry;
        
        if ((location < 1) || (location > numLocations)) {
            return "Error";
        }
        else { 
            whichEntry = rand.nextInt(challenges.length);
            return challenges[whichEntry];
        }
    }
    
    
}
