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
public class ActorTest {
    
    public ActorTest() {
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
     * Test of values method, of class Actor.
     */
    @Test
    public void testValues() {
        this.console.println("values");
        Actor[] expResult = null;
        Actor[] result = Actor.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Actor.
     */
    @Test
    public void testValueOf() {
        this.console.println("valueOf");
        String name = "";
        Actor expResult = null;
        Actor result = Actor.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Actor.
     */
    @Test
    public void testToString() {
        this.console.println("toString");
        Actor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Actor.
     */
//    @Test
//    public void testGetType() {
//        this.console.println("getType");
//        Actor instance = new Actor();
//        String expResult = "";
//        String result = instance.getType();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setType method, of class Actor.
//     */
//    @Test
//    public void testSetType() {
//        this.console.println("setType");
//        String type = "";
//        Actor instance = new Actor();
//        instance.setType(type);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Actor.
//     */
//    @Test
//    public void testToString() {
//        this.console.println("toString");
//        Actor instance = new Actor();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hashCode method, of class Actor.
//     */
//    @Test
//    public void testHashCode() {
//        this.console.println("hashCode");
//        Actor instance = new Actor();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Actor.
//     */
//    @Test
//    public void testEquals() {
//        this.console.println("equals");
//        Object obj = null;
//        Actor instance = new Actor();
//        boolean expResult = false;
//        boolean result = instance.equals(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
