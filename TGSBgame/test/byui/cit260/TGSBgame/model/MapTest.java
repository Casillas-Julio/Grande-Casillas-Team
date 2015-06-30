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
public class MapTest {
    
    public MapTest() {
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
     * Test of getRowCount method, of class Map.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRowCount method, of class Map.
     */
    @Test
    public void testSetRowCount() {
        System.out.println("setRowCount");
        int noOfRows = 0;
        Map instance = new Map();
        instance.setRowCount(noOfRows);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class Map.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumnCount method, of class Map.
     */
    @Test
    public void testSetColumnCount() {
        System.out.println("setColumnCount");
        int noOfColumns = 0;
        Map instance = new Map();
        instance.setColumnCount(noOfColumns);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Map.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Map instance = new Map();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Map.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Map instance = new Map();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocations method, of class Map.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Map instance = new Map();
        Location[][] expResult = null;
        Location[][] result = instance.getLocations();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
