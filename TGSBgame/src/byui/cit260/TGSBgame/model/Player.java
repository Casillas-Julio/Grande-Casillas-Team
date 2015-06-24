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
public class Player implements Serializable{
    
    //class instance variables
    public String name;
    private int fruits;
    private boolean bonus20;
    private boolean bonus40;
    private boolean bonus60;
    
    public int getFruits() {
        return fruits;
    }

    public void setFruits(int fruits) {
        this.fruits = fruits;
    }

    public boolean isBonus20() {
        return bonus20;
    }

    public void setBonus20(boolean bonus20) {
        this.bonus20 = bonus20;
    }

    public boolean isBonus40() {
        return bonus40;
    }

    public void setBonus40(boolean bonus40) {
        this.bonus40 = bonus40;
    }

    public boolean isBonus60() {
        return bonus60;
    }

    public void setBonus60(boolean bonus60) {
        this.bonus60 = bonus60;
    }
    
    public Player() {
        this.bonus20 = false;
        this.bonus40 = false;
        this.bonus60 = false;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", fruits=" + fruits + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        //hash = 13 * hash + Objects.hashCode(this.attribute);
        hash = 13 * hash + this.fruits;
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
        final Player other = (Player) obj;
        
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        
        if (this.fruits != other.fruits) {
            return false;
        }
        return true;
    }

    void setName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPlayerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
