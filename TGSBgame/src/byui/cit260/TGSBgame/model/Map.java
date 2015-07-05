/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import byui.cit260.TGSBgame.exceptions.MapException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragon's
 */
public class Map implements Serializable {

    // class instance variables
    private Location [][] locations;
    private int noOfRows;
    private int noOfColumns;

    
    
    public int getRowCount() {
        return noOfRows;
    }

    public void setRowCount(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getColumnCount() {
        return noOfColumns;
    }

    public void setColumnCount(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Map() {    
    }
    
    /**
     *
     * @param noOfRows
     * @param noOfColumns
     */
    public Map(int noOfRows, int noOfColumns) {
        int linearLocation = 0;
        
        if (noOfRows < 1 || noOfColumns <1) {
            System.out.println("The number of rows and columns must be > zero");
            return;//MAP EXCEPTION GOES HERE!!
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        for (int row = 0; row < noOfRows; row++) {
            for  (int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setLinearLocation(linearLocation++);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.noOfRows != other.noOfRows) {
            try {
                throw new MapException("Number of row is invalid");
            } catch (MapException ex) {
                Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (this.noOfColumns != other.noOfColumns) {
            try {
                throw new MapException ("Number of columns are invalid");
            } catch (MapException ex) {
                Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + '}';
    }

    public Location[][] getLocations() {
        return this.locations;
    }

    public Location getLocation(int row, int column) {
        return this.locations[row][column];
    }
}

