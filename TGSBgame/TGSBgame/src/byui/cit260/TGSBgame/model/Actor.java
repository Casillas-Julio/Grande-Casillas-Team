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
public class Actor implements Serializable{
    
    //Class Instance Variables
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Actor() {
    }

    @Override
    public String toString() {
        return "Actor{" + "type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.type);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
}
