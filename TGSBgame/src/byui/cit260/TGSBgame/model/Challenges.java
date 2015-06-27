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
public enum Challenges implements Serializable{
    
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
    rebelion,
    fear,
    greed,
    loneliness,
    betrayal,
    power,
    poverty,
    loss,
    fun;
//}

//public class Challenges implements Serializable{
    
    //class instance variables
    private String type;
    private double ammount;
    
    Challenges() {
        String[] challenges = new String[Challenge.values().length];
        
        String doubt = new String("doubt description");//create new challenge
        challenges[Challenge.doubt.ordinal()] = doubt;// save challenge in challenge
        
        String iniquity = new String("iniquity description");
        challenges[Challenge.iniquity.ordinal()] = iniquity;
        
        String addictions = new String("addictions description");
        challenges[Challenge.addictions.ordinal()] = addictions;
        
        String ignorance = new String("ignorance description");
        challenges[Challenge.ignorance.ordinal()] = ignorance;
        
        String dishonesty = new String("dishonesty description");
        challenges[Challenge.dishonesty.ordinal()] = dishonesty;
        
        String deception = new String("deception description");
        challenges[Challenge.deception.ordinal()] = deception;
        
        String pride = new String("pride description");
        challenges[Challenge.pride.ordinal()] = pride;
        
        String unemployment = new String("unemployment description");
        challenges[Challenge.unemployment.ordinal()] = unemployment;
        
        String peer_pressure = new String("peer_pressure description");
        challenges[Challenge.peer_pressure.ordinal()] = peer_pressure;
        
        String sickeness = new String("sickeness description");
        challenges[Challenge.sickeness.ordinal()] = sickeness;
        
        String rebelion = new String("rebelion description");
        challenges[Challenge.rebelion.ordinal()] = rebelion;
        
        String fear = new String("fear description");
        challenges[Challenge.fear.ordinal()] = fear;
        
        String greed = new String("greed description");
        challenges[Challenge.greed.ordinal()] = greed;
        
        String loneliness = new String("loneliness description");
        challenges[Challenge.loneliness.ordinal()] = loneliness;
        
        String betrayal = new String("betrayal description");
        challenges[Challenge.betrayal.ordinal()] = betrayal;
        
        String power = new String("power description");
        challenges[Challenge.power.ordinal()] = power;
        
        String poverty = new String("poverty description");
        challenges[Challenge.poverty.ordinal()] = poverty;
        
        String loss = new String("loss description");
        challenges[Challenge.loss.ordinal()] = loss;
        
        String fun = new String("fun description");
        challenges[Challenge.fun.ordinal()] = fun;
        
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
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
