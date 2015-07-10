/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adriana
 */
public class LocationTest {
    
    public LocationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRow method, of class Location.
     */
    @Test
    public void testGetRow() {
        //this.console.println("getRow");
        Location instance = null;
        int expResult = 0;
        int result = instance.getRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRow method, of class Location.
     */
    @Test
    public void testSetRow() {
        //this.console.println("setRow");
        int row = 0;
        Location instance = null;
        instance.setRow(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumn method, of class Location.
     */
    @Test
    public void testGetColumn() {
        //this.console.println("getColumn");
        Location instance = null;
        int expResult = 0;
        int result = instance.getColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumn method, of class Location.
     */
    @Test
    public void testSetColumn() {
        //this.console.println("setColumn");
        int column = 0;
        Location instance = null;
        instance.setColumn(column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Location.
     */
    @Test
    public void testToString() {
        //this.console.println("toString");
        Location instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Location.
     */
    @Test
    public void testHashCode() {
        //this.console.println("hashCode");
        Location instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Location.
     */
    @Test
    public void testEquals() {
        //this.console.println("equals");
        Object obj = null;
        Location instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVisited method, of class Location.
     */
    @Test
    public void testIsVisited() {
        //this.console.println("isVisited");
        Location instance = new Location();
        boolean expResult = false;
        boolean result = instance.isVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisited method, of class Location.
     */
    @Test
    public void testSetVisited() {
        //this.console.println("setVisited");
        boolean visited = false;
        Location instance = new Location();
        instance.setVisited(visited);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScene method, of class Location.
     */
    @Test
    public void testGetScene() {
        //this.console.println("getScene");
        Location instance = new Location();
        Scene expResult = null;
        Scene result = instance.getScene();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScene method, of class Location.
     */
    @Test
    public void testSetScene() {
        //this.console.println("setScene");
        Scene scene = null;
        Location instance = new Location();
        instance.setScene(scene);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
