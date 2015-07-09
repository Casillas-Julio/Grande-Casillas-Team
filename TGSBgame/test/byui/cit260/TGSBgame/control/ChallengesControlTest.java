/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.exceptions.ChallengesControlException;
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
public class ChallengesControlTest {
    
    public ChallengesControlTest() {
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
     * Test of getChallenge method, of class ChallengesControl.
     */
    @Test
    public void testGetChallenge() {
        this.console.println("getChallenge");
        int location = 0;
        ChallengesControl instance = new ChallengesControl();
        String expResult = "";
        String result;
        try {
            result = instance.getChallenge(location);
            assertEquals(expResult, result);
        } catch (ChallengesControlException ex) {
            Logger.getLogger(ChallengesControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
