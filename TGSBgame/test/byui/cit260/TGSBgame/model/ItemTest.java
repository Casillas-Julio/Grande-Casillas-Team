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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getRequiredAmount method, of class Item.
     */
    @Test
    public void testGetRequiredAmount() {
        System.out.println("getRequiredAmount");
        Item instance = new Item();
        double expResult = 0.0;
        double result = instance.getRequiredAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequiredAmount method, of class Item.
     */
    @Test
    public void testSetRequiredAmount() {
        System.out.println("setRequiredAmount");
        double requiredAmount = 0.0;
        Item instance = new Item();
        instance.setRequiredAmount(requiredAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantityInStock method, of class Item.
     */
    @Test
    public void testGetQuantityInStock() {
        System.out.println("getQuantityInStock");
        Item instance = new Item();
        double expResult = 0.0;
        double result = instance.getQuantityInStock();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityInStock method, of class Item.
     */
    @Test
    public void testSetQuantityInStock() {
        System.out.println("setQuantityInStock");
        double quantityInStock = 0.0;
        Item instance = new Item();
        instance.setQuantityInStock(quantityInStock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Item.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Item instance = new Item();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Item.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Item.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Item instance = new Item();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
