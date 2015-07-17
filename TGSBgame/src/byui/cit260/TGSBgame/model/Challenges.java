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
 * @author Dragon's
 */
//public enum Challenges {
enum ChallengeEnum {
    doubt,
    iniquity,
    addictions,
    ignorance,
    dishonesty,
    deception,
    pride,
    unemployment,
    peer_pressure,
    sickeness,
    rebellion,
    fear,
    greed,
    loneliness,
    betrayal,
    power,
    poverty,
    loss,
    fun;
}

public class Challenges implements Serializable{
    
    //class instance variables
    private String type;
    private double ammount;
    private final String[] challenges;

    // assignment 9 - implement an array and populate the list with appropriate objects
    public Challenges() {
        challenges = new String[ChallengeEnum.values().length];
        //FIXME move text from ChallengeView to here in place of the description -- need to figure out how to format it.
        String doubt = "Are you here visiting NY? Are you here for a specific reason? You come across as a good person, are you religious? Are you one of those people that only goes to one church?How do you know you are going to a good one, or even if there's such a thing? Are you sure you are making a smart choice?What do you think about experiencing a different faith or philosophy that can make you happy?";//create new challenge
        challenges[ChallengeEnum.doubt.ordinal()] = doubt;// save challenge in challenge
        
        String iniquity = "iniquity description";
        challenges[ChallengeEnum.iniquity.ordinal()] = iniquity;
        
        String addictions = "addictions description";
        challenges[ChallengeEnum.addictions.ordinal()] = addictions;
        
        String ignorance = "ignorance description";
        challenges[ChallengeEnum.ignorance.ordinal()] = ignorance;
        
        String dishonesty = "dishonesty description";
        challenges[ChallengeEnum.dishonesty.ordinal()] = dishonesty;
        
        String deception = "deception description";
        challenges[ChallengeEnum.deception.ordinal()] = deception;
        
        String pride = "pride description";
        challenges[ChallengeEnum.pride.ordinal()] = pride;
        
        String unemployment = "unemployment description";
        challenges[ChallengeEnum.unemployment.ordinal()] = unemployment;
        
        String peer_pressure = "peer_pressure description";
        challenges[ChallengeEnum.peer_pressure.ordinal()] = peer_pressure;
        
        String sickeness = "sickeness description";
        challenges[ChallengeEnum.sickeness.ordinal()] = sickeness;
        
        String rebelion = "rebelion description";
        challenges[ChallengeEnum.rebellion.ordinal()] = rebelion;
        
        String fear = "fear description";
        challenges[ChallengeEnum.fear.ordinal()] = fear;
        
        String greed = "greed description";
        challenges[ChallengeEnum.greed.ordinal()] = greed;
        
        String loneliness = "loneliness description";
        challenges[ChallengeEnum.loneliness.ordinal()] = loneliness;
        
        String betrayal = "betrayal description";
        challenges[ChallengeEnum.betrayal.ordinal()] = betrayal;
        
        String power = "power description";
        challenges[ChallengeEnum.power.ordinal()] = power;
        
        String poverty = "poverty description";
        challenges[ChallengeEnum.poverty.ordinal()] = poverty;
        
        String loss = "loss description";
        challenges[ChallengeEnum.loss.ordinal()] = loss;
        
        String fun = "fun description";
        challenges[ChallengeEnum.fun.ordinal()] = fun;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumChallenges(){
        return challenges.length;
    }
            
            
    public String getChallenge (int whichEntry){
        return challenges[whichEntry];
    }
    
    @Override
    public String toString() {
        return "Challenges{" + "type=" + type + ", ammount=" + ammount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.ammount) ^ (Double.doubleToLongBits(this.ammount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Challenges other = (Challenges) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ammount) != Double.doubleToLongBits(other.ammount)) {
            return false;
        }
        return true;
    }
}
