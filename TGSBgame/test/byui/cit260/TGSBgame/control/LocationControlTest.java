/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Player;
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
public class LocationControlTest {
    
    public LocationControlTest() {
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
     * Test of startLocationControl method, of class LocationControl.
     */
    @Test
    public void testStartLocationControl() {
        System.out.println("startLocationControl");
        Player player = null;
        LocationControl.startLocationControl(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class LocationControl.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        LocationControl instance = new LocationControl();
        int expResult = 0;
        int result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class LocationControl.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        int row = 0;
        int column = 0;
        LocationControl instance = new LocationControl();
        int expResult = 0;
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
