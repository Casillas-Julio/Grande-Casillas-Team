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
public class AttributeTest {
    
    public AttributeTest() {
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
     * Test of getType method, of class Attribute.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Attribute instance = new Attribute();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Attribute.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Attribute instance = new Attribute();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmmount method, of class Attribute.
     */
    @Test
    public void testGetAmmount() {
        System.out.println("getAmmount");
        Attribute instance = new Attribute();
        double expResult = 0.0;
        double result = instance.getAmmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmmount method, of class Attribute.
     */
    @Test
    public void testSetAmmount() {
        System.out.println("setAmmount");
        double ammount = 0.0;
        Attribute instance = new Attribute();
        instance.setAmmount(ammount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Attribute.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Attribute instance = new Attribute();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Attribute.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Attribute instance = new Attribute();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Attribute.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Attribute instance = new Attribute();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
