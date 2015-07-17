/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.exceptions.ChallengesControlException;
import byui.cit260.TGSBgame.model.Challenges;
import java.io.Serializable;
import java.util.Random;
import tgsbgame.TGSBgame;

/**
 *
 * @author Adriana
 */
public class ChallengesControl implements Serializable{
    
    //class variable
    private static int numLocations;
    private static Random rand; 

    public static void ChallengesControlSetup(int numberLocations) {
        rand = new Random(System.currentTimeMillis());
        numLocations = numberLocations;
    }

    public static String getChallenge(int location) throws ChallengesControlException{
        int whichEntry;
        Challenges challenges;
        
        if ((location < 0) || (location > numLocations - 1)) {
            throw new ChallengesControlException("Can not move actor to location"
                                            + " because that location is outside "
                                            + " the bounds of the map.");
        }
        else {
            challenges = TGSBgame.getChallenges();
            whichEntry = rand.nextInt(challenges.getNumChallenges());
            return challenges.getChallenge(whichEntry); 
        }
    }
}
