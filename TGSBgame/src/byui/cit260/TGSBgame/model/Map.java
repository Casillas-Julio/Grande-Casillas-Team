/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import java.io.Serializable;

/**
 *
 * @author Dragon's
 */
public class Map implements Serializable {

    // class instance variables
    private int rowCount;
    private int columnCount;
    private Location [][] locations;
    private int noOfRows;
    private int noOfColumns;

    
    
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

//    public Map(int rowCount, int columnCount) {
//        this.rowCount = rowCount;
//        this.columnCount = columnCount;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.rowCount;
        hash = 89 * hash + this.columnCount;
        return hash;
    }
    
    public Map() {    
    }
    
    /**
     *
     * @param noOfRows
     * @param noOfColumns
     */
    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns <1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        for (int row = 0; row < noOfRows; row++) {
            for  (int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location. setRow(row);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                location[row][column] = location;
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
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    private void setColumn(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

