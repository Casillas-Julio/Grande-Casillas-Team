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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        //this.console.println("getName");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        //this.console.println("setName");
        String name = "";
        Player instance = new Player();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        //this.console.println("toString");
        Player instance = new Player();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Player.
     */
    @Test
    public void testHashCode() {
        //this.console.println("hashCode");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Player.
     */
    @Test
    public void testEquals() {
        //this.console.println("equals");
        Object obj = null;
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruits method, of class Player.
     */
    @Test
    public void testGetFruits() {
        //this.console.println("getFruits");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getFruits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFruits method, of class Player.
     */
    @Test
    public void testSetFruits() {
        //this.console.println("setFruits");
        int fruits = 0;
        Player instance = new Player();
        instance.setFruits(fruits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBonus20 method, of class Player.
     */
    @Test
    public void testIsBonus20() {
        //this.console.println("isBonus20");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.isBonus20();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBonus20 method, of class Player.
     */
    @Test
    public void testSetBonus20() {
        //this.console.println("setBonus20");
        boolean bonus20 = false;
        Player instance = new Player();
        instance.setBonus20(bonus20);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBonus40 method, of class Player.
     */
    @Test
    public void testIsBonus40() {
        //this.console.println("isBonus40");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.isBonus40();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBonus40 method, of class Player.
     */
    @Test
    public void testSetBonus40() {
        //this.console.println("setBonus40");
        boolean bonus40 = false;
        Player instance = new Player();
        instance.setBonus40(bonus40);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBonus60 method, of class Player.
     */
    @Test
    public void testIsBonus60() {
        //this.console.println("isBonus60");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.isBonus60();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBonus60 method, of class Player.
     */
    @Test
    public void testSetBonus60() {
        //this.console.println("setBonus60");
        boolean bonus60 = false;
        Player instance = new Player();
        instance.setBonus60(bonus60);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName_String() {
        //this.console.println("setName");
        String name = "";
        Player instance = new Player();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName_0args() {
        //this.console.println("setName");
        Player instance = new Player();
        instance.setName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerName method, of class Player.
     */
    @Test
    public void testSetPlayerName() {
        //this.console.println("setPlayerName");
        Player instance = new Player();
        instance.setPlayerName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
