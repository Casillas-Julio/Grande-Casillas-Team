/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.exceptions.ChallengesControlException;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Adriana
 */
public class ChallengesControl implements Serializable{
    
    //class variable
    private static final String[] challengesList = 
        {"doubt", "iniquity" ,"addictions", "ignorance", "dishonesty", 
         "deception", "pride", "unemployment", "peer pressure", "sickeness",
         "rebelion", "fear", "greed", "loneliness", "betrayal",
         "power", "poverty", "loss","fun"};
    private static int numLocations;
    private static Random rand; 

    public static void ChallengesControlSetup(int numberLocations) {
        rand = new Random(System.currentTimeMillis());
        numLocations = numberLocations;
    }

    public static String getChallenge(int location) throws ChallengesControlException{
        int whichEntry;
        
        if ((location < 1) || (location > numLocations)) {
            throw new ChallengesControlException("Can not move actor to location"
                                            + " because that location is outside "
                                            + " the bounds of the map.");
        }
        else { 
            whichEntry = rand.nextInt(challengesList.length);
            return challengesList[whichEntry];
        }
    }
}
