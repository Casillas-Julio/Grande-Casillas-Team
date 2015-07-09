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
public class ChallengesTest {
    
    public ChallengesTest() {
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
     * Test of getType method, of class Challenges.
     */
    @Test
    public void testGetType() {
        this.console.println("getType");
        Challenges instance = new Challenges();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Challenges.
     */
    @Test
    public void testSetType() {
        this.console.println("setType");
        String type = "";
        Challenges instance = new Challenges();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Challenges.
     */
    @Test
    public void testToString() {
        this.console.println("toString");
        Challenges instance = new Challenges();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Challenges.
     */
    @Test
    public void testHashCode() {
        this.console.println("hashCode");
        Challenges instance = new Challenges();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Challenges.
     */
    @Test
    public void testEquals() {
        this.console.println("equals");
        Object obj = null;
        Challenges instance = new Challenges();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
