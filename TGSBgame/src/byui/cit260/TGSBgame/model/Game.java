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
public class Game implements Serializable {
 
    //class instance variables
    private String player;
    private double actors;
    private String attribute;
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Game() {
    }    

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public double getActors() {
        return actors;
    }

    public void setActors(double actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", actors=" + actors + ", attribute=" + attribute + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.player);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.actors) ^ (Double.doubleToLongBits(this.actors) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.attribute);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actors) != Double.doubleToLongBits(other.actors)) {
            return false;
        }
        return Objects.equals(this.attribute, other.attribute);
    }

}
