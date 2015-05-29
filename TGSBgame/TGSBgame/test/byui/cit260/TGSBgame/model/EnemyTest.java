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
public class EnemyTest {
    
    public EnemyTest() {
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
     * Test of getName method, of class Enemy.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Enemy instance = new Enemy();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Enemy.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Enemy instance = new Enemy();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRow method, of class Enemy.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Enemy instance = new Enemy();
        double expResult = 0.0;
        double result = instance.getRow();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRow method, of class Enemy.
     */
    @Test
    public void testSetRow() {
        System.out.println("setRow");
        double row = 0.0;
        Enemy instance = new Enemy();
        instance.setRow(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumn method, of class Enemy.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        Enemy instance = new Enemy();
        double expResult = 0.0;
        double result = instance.getColumn();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumn method, of class Enemy.
     */
    @Test
    public void testSetColumn() {
        System.out.println("setColumn");
        double column = 0.0;
        Enemy instance = new Enemy();
        instance.setColumn(column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemyNo method, of class Enemy.
     */
    @Test
    public void testGetEnemyNo() {
        System.out.println("getEnemyNo");
        Enemy instance = new Enemy();
        double expResult = 0.0;
        double result = instance.getEnemyNo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnemyNo method, of class Enemy.
     */
    @Test
    public void testSetEnemyNo() {
        System.out.println("setEnemyNo");
        double enemyNo = 0.0;
        Enemy instance = new Enemy();
        instance.setEnemyNo(enemyNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Enemy.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Enemy instance = new Enemy();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Enemy.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Enemy instance = new Enemy();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Enemy.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Enemy instance = new Enemy();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
