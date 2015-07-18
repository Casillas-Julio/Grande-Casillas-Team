/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

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
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
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
     * Test of startProgram method, of class StartProgramView.
     */
    @Test
    public void testStartProgram() throws Exception {
        System.out.println("startProgram");
        StartProgramView instance = new StartProgramView();
        instance.startProgram();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayWelcomeMessage method, of class StartProgramView.
     */
    @Test
    public void testDisplayWelcomeMessage() {
        System.out.println("displayWelcomeMessage");
        Player player = null;
        StartProgramView instance = new StartProgramView();
        instance.displayWelcomeMessage(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class StartProgramView.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        StartProgramView instance = new StartProgramView();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class StartProgramView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        Object obj = null;
        StartProgramView instance = new StartProgramView();
        boolean expResult = false;
        boolean result = instance.doAction(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
