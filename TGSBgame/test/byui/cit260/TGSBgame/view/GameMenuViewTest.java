/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

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
public class GameMenuViewTest {
    
    public GameMenuViewTest() {
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
     * Test of doAction method, of class GameMenuView.
     */
    @Test
    public void testDoAction() {
        //this.console.println("doAction");
        Object obj = null;
        GameMenuView instance = new GameMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of <error> method, of class GameMenuView.
     */
    @Test
    public void test<error>() {
        System.out.println("<error>");
        GameMenuView instance = new GameMenuView();
        instance.<error>();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntNumber method, of class GameMenuView.
     */
    @Test
    public void testGetIntNumber() {
        System.out.println("getIntNumber");
        GameMenuView instance = new GameMenuView();
        int expResult = 0;
        int result = instance.getIntNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class GameMenuView.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        GameMenuView instance = new GameMenuView();
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printActorList method, of class GameMenuView.
     */
    @Test
    public void testPrintActorList() {
        System.out.println("printActorList");
        String outputLocation = "";
        GameMenuView instance = new GameMenuView();
        instance.printActorList(outputLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
