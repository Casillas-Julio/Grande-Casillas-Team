/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.exceptions.ProgramControlException;
import byui.cit260.TGSBgame.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ProgramControlTest {
    
    public ProgramControlTest() {
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
     * Test of createPlayer method, of class ProgramControl.
     */
    @Test
    public void testCreatePlayer() {
        //this.console.println("createPlayer");
        String name = "";
        Player expResult = null;
        Player result;
        try {
            result = ProgramControl.createPlayer(name);
            assertEquals(expResult, result);
        } catch (ProgramControlException ex) {
            Logger.getLogger(ProgramControlTest.class.getName()).log(Level.INFO, null, ex);
        }
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
