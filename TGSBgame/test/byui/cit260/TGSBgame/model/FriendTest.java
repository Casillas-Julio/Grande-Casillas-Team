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
public class FriendTest {
    
    public FriendTest() {
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
     * Test of getName method, of class Friend.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Friend instance = new Friend();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Friend.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Friend instance = new Friend();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRow method, of class Friend.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Friend instance = new Friend();
        double expResult = 0.0;
        double result = instance.getRow();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRow method, of class Friend.
     */
    @Test
    public void testSetRow() {
        System.out.println("setRow");
        double row = 0.0;
        Friend instance = new Friend();
        instance.setRow(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumn method, of class Friend.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        Friend instance = new Friend();
        double expResult = 0.0;
        double result = instance.getColumn();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumn method, of class Friend.
     */
    @Test
    public void testSetColumn() {
        System.out.println("setColumn");
        double column = 0.0;
        Friend instance = new Friend();
        instance.setColumn(column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFriendNo method, of class Friend.
     */
    @Test
    public void testGetFriendNo() {
        System.out.println("getFriendNo");
        Friend instance = new Friend();
        double expResult = 0.0;
        double result = instance.getFriendNo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFriendNo method, of class Friend.
     */
    @Test
    public void testSetFriendNo() {
        System.out.println("setFriendNo");
        double friendNo = 0.0;
        Friend instance = new Friend();
        instance.setFriendNo(friendNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Friend.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Friend instance = new Friend();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Friend.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Friend instance = new Friend();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Friend.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Friend instance = new Friend();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
