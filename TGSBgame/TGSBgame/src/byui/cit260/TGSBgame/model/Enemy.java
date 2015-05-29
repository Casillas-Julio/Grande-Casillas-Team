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
public class Enemy implements Serializable{
    
    //Class Instance Variables
    private String name;
    private double row;
    private double column;
    private double enemyNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public double getEnemyNo() {
        return enemyNo;
    }

    public void setEnemyNo(double enemyNo) {
        this.enemyNo = enemyNo;
    }

    public Enemy() {
    }

    @Override
    public String toString() {
        return "Enemy{" + "name=" + name + ", row=" + row + ", column=" + column + ", enemyNo=" + enemyNo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.enemyNo) ^ (Double.doubleToLongBits(this.enemyNo) >>> 32));
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
        final Enemy other = (Enemy) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (Double.doubleToLongBits(this.enemyNo) != Double.doubleToLongBits(other.enemyNo)) {
            return false;
        }
        return true;
    }

   
    
}